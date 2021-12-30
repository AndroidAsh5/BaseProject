package com.evato.o4s.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.evato.o4s.commons.liveDataHelpers.SingleLiveEvent

abstract class BaseViewModel(application: Application) : AndroidViewModel(application) {

    private val _showInternetError = MutableLiveData<Boolean>()
    val showInternetError: LiveData<Boolean>
        get() = _showInternetError

    private val _showToast = SingleLiveEvent<String>()
    val showToast: SingleLiveEvent<String>
        get() = _showToast

    fun showToast(string: String) {
        _showToast.value = string
    }

    fun showInternetError() {
        _showInternetError.value = true
    }
}