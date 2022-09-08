package com.example.mymovieapp.movielist.ui.movieList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.mymovieapp.R
import com.example.mymovieapp.databinding.MovieItemBinding
import com.example.mymovieapp.movielist.data.domain.model.Movie

class MovieViewHolder(
    movieItemBinding: MovieItemBinding
) : RecyclerView.ViewHolder(movieItemBinding.root) {

    private val title = movieItemBinding.movieTitle
    private val popularity = movieItemBinding.moviePopulatiry
    private val releaseDate = movieItemBinding.movieReleaseDate
    //    private val genres = movieItemBinding.movieGenres
    private val image = movieItemBinding.movieImage

    fun bind(movie: Movie) {
        title.text = movie.title
        popularity.text = movie.popularity
        releaseDate.text = movie.release
//        genres.text = movie.genres
        image.load(movie.image) {
            crossfade(true)
            placeholder(R.drawable.ic_img_loading_error)
        }
    }

    companion object {
        fun create(parent: ViewGroup): MovieViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val itemBinding = MovieItemBinding.inflate(inflater, parent, false)
            return MovieViewHolder(itemBinding)
        }
    }

}