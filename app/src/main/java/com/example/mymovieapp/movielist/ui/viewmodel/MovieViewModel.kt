package com.example.mymovieapp.movielist.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mymovieapp.movielist.data.repository.IMovieRepository

class MovieViewModel(
    private val movieApi: IMovieRepository
) : ViewModel() {

}