package com.evato.o4s.network

import android.util.Log
import com.squareup.moshi.Moshi
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException

suspend fun <T> safeApiCall(apiCall: suspend () -> Response<T>
): ResultWrapper<Response<T>> {
    return try {
        val response = apiCall.invoke()
        val responseCode = response.code()
        if (response.isSuccessful && (responseCode in 200..299))
            ResultWrapper.Success(response)
        else {
            ResultWrapper.GenericError(responseCode, convertErrorBody(response.errorBody()!!.string()))
        }
    } catch (throwable: Throwable) {
        when (throwable) {
            is IOException -> ResultWrapper.NetworkError
            is HttpException -> {
                val code = throwable.code()
                var errorResponse = convertErrorBody(throwable)
                if (errorResponse==null)
                    errorResponse = ErrorResponse("","Something went wrong. Please try again","null")
                ResultWrapper.GenericError(code, errorResponse)
            }
            else -> {
                Log.e("GenericApiCallWrapper ", "Message is " + throwable.message)
                ResultWrapper.GenericError(null, null)
            }
        }
    }
}

private fun convertErrorBody(throwable: HttpException): ErrorResponse? {
    return try {
        throwable.response()?.errorBody()?.source()?.let {
            val moshiAdapter = Moshi.Builder().build().adapter(ErrorResponse::class.java)
            moshiAdapter.fromJson(it)
        }
    } catch (exception: Exception) {
        null
    }
}

private fun convertErrorBody(string: String): ErrorResponse? {
    val moshiAdapter = Moshi.Builder().build().adapter(ErrorResponse::class.java)
    return moshiAdapter.fromJson(string)
}