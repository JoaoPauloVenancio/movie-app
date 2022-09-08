package com.example.mymovieapp.movielist.data.repository

import androidx.paging.PagingSource
import com.example.mymovieapp.movielist.data.datasource.IMovieDatasource
import com.example.mymovieapp.movielist.data.domain.model.Movie
import com.example.mymovieapp.movielist.data.paging.CharactersPaging
import com.example.mymovieapp.movielist.data.response.MovieResponse
import javax.inject.Inject

class MovieRepositoryImp @Inject constructor(
    private val movieDatasource: IMovieDatasource<MovieResponse>
    ) : IMovieRepository {

    override suspend fun getMovies(query: String): PagingSource<Int, Movie> {
        return CharactersPaging()
    }
}