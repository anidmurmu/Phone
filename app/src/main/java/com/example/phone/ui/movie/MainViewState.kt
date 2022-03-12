package com.example.phone.ui.movie

import androidx.lifecycle.MutableLiveData
import com.example.phone.ui.utils.base.recyclerview.BaseBindingRVModel

sealed class MainViewState {
    val movieList: MutableLiveData<List<BaseBindingRVModel>> = MutableLiveData()

    object Initial : MainViewState()
    data class Success(val str: String): MainViewState()
    object Failure : MainViewState()
}