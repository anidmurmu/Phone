package com.example.phone.data.source.network.retrofit.movie

import com.example.phone.data.entity.movie.NetworkResp
import retrofit2.http.GET

interface MovieService {
    @GET("movie/now_playing?api_key=38a73d59546aa378980a88b645f487fc/")
    suspend fun getPopularMovieList(): NetworkResp
}