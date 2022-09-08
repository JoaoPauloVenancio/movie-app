package com.example.mymovieapp.movielist.data.datasource

import com.example.mymovieapp.movielist.data.response.MovieResponse
import com.example.mymovieapp.movielist.data.services.MovieApiInterface
import javax.inject.Inject

class MovieDatasourceImp @Inject constructor(
    private val movieApi: MovieApiInterface
) : IMovieDatasource<MovieResponse> {

    override suspend fun getMovies(queries: Map<String, String>): MovieResponse {
        return movieApi.getMovieList(queries)
    }
}