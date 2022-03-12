package com.example.phone.data.repositoryimpl.movie

import com.example.phone.data.mapper.movie.MovieMapper
import com.example.phone.data.source.network.retrofit.movie.MovieSrc
import com.example.phone.domain.model.movie.MovieUiModel
import com.example.phone.domain.model.response.Response
import com.example.phone.domain.repository.movie.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieSrc: MovieSrc,
    private val movieMapper: MovieMapper
) : MovieRepository {
    override suspend fun getPopularMovieList(): Response<List<MovieUiModel>> {
        return movieMapper.mapFrom(movieSrc.getPopularMovieList())
    }
}