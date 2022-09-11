package com.example.mymovieapp.movielist.data.datasource.remote

import com.example.mymovieapp.movielist.data.model.MovieResponse
import com.example.mymovieapp.movielist.data.datasource.remote.services.MovieApiInterface
import javax.inject.Inject

class MovieDatasourceImpl @Inject constructor(
    private val movieApi: MovieApiInterface,
) : MovieDatasource {

    override suspend fun getMovies(page: Int): MovieResponse {
        return movieApi.getMovieList(page = page)
    }
}