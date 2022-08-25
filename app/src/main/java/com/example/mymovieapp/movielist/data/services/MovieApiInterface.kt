package com.example.mymovieapp.movielist.data.services

import com.example.mymovieapp.movielist.data.models.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=40b9d58f7cf6295fe34c46828cc78266")
    fun getMovieList(): Call<List<Movie>>

}