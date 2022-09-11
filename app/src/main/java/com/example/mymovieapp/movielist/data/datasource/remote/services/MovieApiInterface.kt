package com.example.mymovieapp.movielist.data.datasource.remote.services

import com.example.mymovieapp.movielist.data.model.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "40b9d58f7cf6295fe34c46828cc78266"

interface MovieApiInterface {

    @GET("popular")
    suspend fun getMovieList(
        @Query("api_key") apiKey: String = API_KEY,
        @Query("page") page: Int = 1,
    ): MovieResponse

}