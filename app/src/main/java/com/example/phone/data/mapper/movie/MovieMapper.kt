package com.example.phone.data.mapper.movie

import com.example.phone.data.entity.movie.MovieInfoNetworkModel
import com.example.phone.data.entity.movie.NetworkResp
import com.example.phone.domain.mapper.Mapper
import com.example.phone.domain.model.movie.MovieUiModel
import com.example.phone.domain.model.response.Response
import javax.inject.Inject

class MovieMapper  @Inject constructor() :
    Mapper<Response<NetworkResp>, Response<List<MovieUiModel>>> {
    override fun mapFrom(inputModel: Response<NetworkResp>): Response<List<MovieUiModel>> {
        return when(inputModel) {
            is Response.Success -> {
                Response.Success(mapToMovieUiModel(inputModel.data.results))
            }
            is Response.Failure -> {
                Response.Failure(inputModel.error)
            }
        }
    }

    private fun mapToMovieUiModel(srcModelList: List<MovieInfoNetworkModel>): List<MovieUiModel> {
        return srcModelList.map {
            MovieUiModel(it.backdropPath,
            it.title,
            it.description)
        }
    }
}