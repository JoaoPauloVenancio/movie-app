package com.example.mymovieapp.movielist.data.repository

import com.example.mymovieapp.movielist.data.models.Movie

interface IMovieDatasource {

    fun getMovies() : List<Movie>
}