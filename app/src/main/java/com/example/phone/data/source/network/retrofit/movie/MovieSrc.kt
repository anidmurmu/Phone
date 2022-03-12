package com.example.phone.data.source.network.retrofit.movie

import com.example.phone.data.entity.movie.NetworkResp
import com.example.phone.domain.model.response.Response
import javax.inject.Inject

class MovieSrc @Inject constructor(
    private val movieService: MovieService
) {
    suspend fun getPopularMovieList(): Response<NetworkResp> {
        val response = try {
            Response.Success(movieService.getPopularMovieList())
        } catch (ex: Exception) {
            Response.Failure(ex)
        }
        return response
    }
}