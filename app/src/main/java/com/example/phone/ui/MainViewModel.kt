package com.example.phone.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.phone.domain.usecase.movie.GetPopularMovieListUseCase
import com.example.phone.domain.usecase.movie.GetPopularMovieListUseCaseImpl
import com.example.phone.ui.MainViewState
import com.example.phone.ui.dispatcher.DispatcherProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dispatcherProvider: DispatcherProvider,
    private val getPopularMovieListUseCase: GetPopularMovieListUseCase
) : ViewModel() {

    init {
    }

    private val _viewState: MutableStateFlow<MainViewState> =
        MutableStateFlow(MainViewState.Initial)
    val viewState: StateFlow<MainViewState> = _viewState.asStateFlow()

    fun getPopularMovieList() {
        viewModelScope.launch(dispatcherProvider.io) {
            getPopularMovieListUseCase.getPopularMovieList()
        }
    }
}