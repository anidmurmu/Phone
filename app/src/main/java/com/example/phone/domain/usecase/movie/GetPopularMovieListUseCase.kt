package com.example.phone.domain.usecase.movie

import com.example.phone.domain.model.movie.MovieUiModel
import com.example.phone.domain.model.response.Response
import com.example.phone.domain.repository.movie.MovieRepository
import javax.inject.Inject

interface GetPopularMovieListUseCase {
    suspend fun getPopularMovieList(): Response<List<MovieUiModel>>
}

class GetPopularMovieListUseCaseImpl @Inject constructor(
    private val movieRepository: MovieRepository
) : GetPopularMovieListUseCase {
    override suspend fun getPopularMovieList(): Response<List<MovieUiModel>> {
        return movieRepository.getPopularMovieList()
    }
}