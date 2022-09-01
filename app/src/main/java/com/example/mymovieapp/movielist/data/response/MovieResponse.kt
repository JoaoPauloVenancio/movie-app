package com.example.mymovieapp.movielist.data.response

data class MovieResponse(
    val id: String?,
    val title: String?,
    val post_path: String?,
    val release_date: String?,
    val adult: String?,
    val backdrop_path: String?,
    val overview: String,
    val genres: List<GenresResponse>
    )