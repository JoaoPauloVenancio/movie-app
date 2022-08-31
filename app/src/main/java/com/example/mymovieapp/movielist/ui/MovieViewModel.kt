package com.example.mymovieapp.movielist.ui

import androidx.lifecycle.ViewModel
import com.example.mymovieapp.movielist.data.repository.IMovieRepository


class MovieViewModel(
    private val movieRepository: IMovieRepository
) : ViewModel() {
}