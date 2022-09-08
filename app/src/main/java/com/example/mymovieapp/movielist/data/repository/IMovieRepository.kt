package com.example.mymovieapp.movielist.data.repository

import com.example.mymovieapp.movielist.data.response.MovieResponse

interface IMovieRepository {

    suspend fun getMovies(): List<MovieResponse>
}