package com.example.mymovieapp.movielist.data.services

import com.example.mymovieapp.movielist.data.response.MovieResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface MovieApiInterface {

    @GET("popular")
    suspend fun getMovieList(
        @QueryMap
        queries: Map<String, String>
    ): MovieResponse

}