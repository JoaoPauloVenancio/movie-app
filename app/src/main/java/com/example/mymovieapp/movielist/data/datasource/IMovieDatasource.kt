package com.example.mymovieapp.movielist.data.datasource

import com.example.mymovieapp.movielist.data.response.MovieResponse

interface IMovieDatasource {

    suspend fun getMovies() : List<MovieResponse>
}