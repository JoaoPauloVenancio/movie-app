package com.example.mymovieapp.movielist.data.repository

import com.example.mymovieapp.movielist.data.models.Movie
import com.example.mymovieapp.movielist.data.services.MovieApiInterface

class MovieDatasourceImp(private val movieApi: MovieApiInterface) : IMovieDatasource {

    override fun getMovies(): List<Movie> {
        return movieApi.getMovieList()
    }
}