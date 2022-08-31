package com.example.mymovieapp.movielist.data.services

import com.example.mymovieapp.movielist.data.models.Movie
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("popular")
    suspend fun getMovieList(): List<Movie>

}