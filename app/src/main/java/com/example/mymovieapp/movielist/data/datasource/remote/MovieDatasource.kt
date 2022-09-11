package com.example.mymovieapp.movielist.data.datasource.remote

import com.example.mymovieapp.movielist.data.model.MovieResponse


interface MovieDatasource {

    suspend fun getMovies(page: Int) : MovieResponse
}