package com.example.mymovieapp.movielist.data.repository

import com.example.mymovieapp.movielist.data.response.MovieResponse

interface IMovieDatasource {

    fun getMovies() : List<MovieResponse>
}