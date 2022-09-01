package com.example.mymovieapp.movielist.data.repository

import com.example.mymovieapp.movielist.data.response.MovieResponse
import com.example.mymovieapp.movielist.data.services.MovieApiInterface

class MovieDatasourceImp(private val movieApi: MovieApiInterface) : IMovieDatasource {

    override fun getMovies(): List<MovieResponse> {
        TODO("Not yet implemented")
    }

}