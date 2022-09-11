package com.example.mymovieapp.movielist.data.repository

import androidx.paging.PagingSource
import com.example.mymovieapp.movielist.ui.model.Movie

interface MovieRepository {

    suspend fun getMovies(): PagingSource<Int, Movie>
}