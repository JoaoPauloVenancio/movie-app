package com.example.mymovieapp.movielist.data.repository

import com.example.mymovieapp.movielist.data.datasource.IMovieDatasource
import com.example.mymovieapp.movielist.data.response.MovieResponse
import javax.inject.Inject

class MovieRepositoryImp @Inject constructor(
    private val movieDatasource: IMovieDatasource
    ) : IMovieRepository {

    override suspend fun  getMovies(): List<MovieResponse> {
       return movieDatasource.getMovies()
    }
}