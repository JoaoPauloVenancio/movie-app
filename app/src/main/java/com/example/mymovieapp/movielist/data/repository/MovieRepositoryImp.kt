package com.example.mymovieapp.movielist.data.repository

import com.example.mymovieapp.movielist.data.models.Movie

class MovieRepositoryImp(private val movieDatasource: IMovieDatasource) : IMovieRepository {

    override fun getMovies(): List<Movie> {
       return movieDatasource.getMovies()
    }
}