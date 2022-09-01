package com.example.mymovieapp.movielist.data.services

import com.example.mymovieapp.movielist.data.response.MovieResponse
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("popular")
    suspend fun getMovieList(): List<MovieResponse>

}