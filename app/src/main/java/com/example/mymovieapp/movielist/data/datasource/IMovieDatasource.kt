package com.example.mymovieapp.movielist.data.datasource


interface IMovieDatasource<T> {

    suspend fun getMovies(queries: Map<String, String>) : T
}