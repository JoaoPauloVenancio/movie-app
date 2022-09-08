package com.example.mymovieapp.movielist.data.response

data class MovieResponse(
    val id: String?,
    val title: String?,
    val poster_path: String?,
    val release_date: String?,
    val adult: String?,
    val backdrop_path: String?,
    val overview: String?,
    val genres: List<GenresResponse>?
)


data class GenresResponse(
    val id: String,
    val name: String
)