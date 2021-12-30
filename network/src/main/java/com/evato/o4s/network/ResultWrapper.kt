package com.evato.o4s.network

sealed class ResultWrapper<out T :Any> {
    data class Success<out T : Any>(val value: T): ResultWrapper<T>()
    data class GenericError(val code: Int? = null, val error: ErrorResponse? = null): ResultWrapper<Nothing>()
    object NetworkError: ResultWrapper<Nothing>()
}