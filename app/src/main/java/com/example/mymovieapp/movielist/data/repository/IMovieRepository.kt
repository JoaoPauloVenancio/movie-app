package com.example.mymovieapp.movielist.data.repository

import androidx.paging.PagingSource
import com.example.mymovieapp.movielist.data.domain.model.Movie

interface IMovieRepository {

    suspend fun getMovies(query: String): PagingSource<Int, Movie>
}