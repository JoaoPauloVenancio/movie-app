package com.example.mymovieapp.movielist.data.repository

import androidx.paging.PagingSource
import com.example.mymovieapp.movielist.data.datasource.remote.MovieDatasource
import com.example.mymovieapp.movielist.ui.model.Movie
import com.example.mymovieapp.movielist.ui.paging.CharactersPaging
import com.example.mymovieapp.movielist.data.model.MovieResponse
import javax.inject.Inject

class MovieRepositoryImp @Inject constructor(
    private val movieDatasource: MovieDatasource
    ) : MovieRepository {

    override suspend fun getMovies(): PagingSource<Int, Movie> {
        return CharactersPaging()
    }
}