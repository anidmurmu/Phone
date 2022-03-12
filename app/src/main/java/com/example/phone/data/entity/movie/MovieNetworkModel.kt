package com.example.phone.data.entity.movie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NetworkResp(
    @SerializedName("dates")
    @Expose
    val dates: DateModel,

    @SerializedName("page")
    @Expose
    val page: Int?,

    @SerializedName("results")
    @Expose
    val results: List<MovieInfoNetworkModel>,

    @SerializedName("total_pages")
    @Expose
    val totalPages: Int?,

    @SerializedName("total_results")
    @Expose
    val totalResults: Int?
)

data class DateModel(
    @SerializedName("maximum")
    @Expose
    val max: String,

    @SerializedName("minimum")
    @Expose
    val min: String
)


data class MovieInfoNetworkModel(

    @SerializedName("backdrop_path")
    @Expose
    val backdropPath: String,

    @SerializedName("adult")
    @Expose
    val title: String,

    @SerializedName("overview")
    @Expose
    val description: String
)



