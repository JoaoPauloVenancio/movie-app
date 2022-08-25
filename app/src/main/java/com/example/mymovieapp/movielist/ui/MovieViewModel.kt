package com.example.mymovieapp.movielist.ui


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bumptech.glide.load.engine.Resource
import com.example.mymovieapp.movielist.data.models.Movie
import com.example.mymovieapp.movielist.data.services.MovieApiInterface
import com.example.mymovieapp.movielist.data.services.MovieApiService
import com.example.mymovieapp.utils.Resource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieViewModel() : ViewModel() {

    private var _movieList = MutableLiveData<Resource<List<Movie>>>()
    val movieList: LiveData<Resource<List<Movie>>> get() = _movieList


    fun getMovieData() {

        val apiService = MovieApiService.getInstance().create(MovieApiInterface::class.java)
        val call = apiService.getMovieList()

        call.enqueue(object : Callback<List<Movie>> {
            override fun onResponse(call: Call<List<Movie>>, response: Response<List<Movie>>) {
                val body = response.body()
                _movieList.value = Resource.success(body!!)
            }

            override fun onFailure(call: Call<List<Movie>>, t: Throwable) {

            }
        })
    }
}