package com.example.mymovieapp.movielist.data.repository

import com.example.mymovieapp.movielist.data.response.MovieResponse

class MovieRepositoryImp(private val movieDatasource: IMovieDatasource) : IMovieRepository {

    override fun getMovies(): List<MovieResponse> {
       return movieDatasource.getMovies()
    }
}