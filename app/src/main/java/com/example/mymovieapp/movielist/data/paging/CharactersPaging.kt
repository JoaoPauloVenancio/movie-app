package com.example.mymovieapp.movielist.data.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.mymovieapp.movielist.data.domain.model.Movie

class CharactersPaging: PagingSource<Int, Movie>() {


    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {

    }

    override fun getRefreshKey(state: PagingState<Int, Movie>): Int? {

    }


}