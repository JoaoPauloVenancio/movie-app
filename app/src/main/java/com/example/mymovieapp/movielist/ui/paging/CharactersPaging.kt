package com.example.mymovieapp.movielist.ui.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.mymovieapp.movielist.ui.model.Movie

class CharactersPaging: PagingSource<Int, Movie>() {


    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
        TODO("Not yet implemented")
    }

    override fun getRefreshKey(state: PagingState<Int, Movie>): Int? {
        TODO("Not yet implemented")
    }


}