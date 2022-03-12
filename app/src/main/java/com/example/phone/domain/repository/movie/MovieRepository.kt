package com.example.phone.domain.repository.movie

import com.example.phone.domain.model.movie.MovieUiModel
import com.example.phone.domain.model.response.Response

interface MovieRepository {
    suspend fun getPopularMovieList(): Response<List<MovieUiModel>>
}