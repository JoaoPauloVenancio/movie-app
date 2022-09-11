package com.example.mymovieapp.movielist.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mymovieapp.databinding.MovieFragmentBinding
import com.example.mymovieapp.movielist.ui.model.Movie
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MovieFragment : Fragment() {

    private var _binding: MovieFragmentBinding? = null
    private val binding: MovieFragmentBinding get() = _binding!!
    private val moviesAdapter = MovieAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = MovieFragmentBinding.inflate(
        inflater,
        container,
        false
    ).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureRecyclerView()
        moviesAdapter.submitList(
            listOf(
                Movie("https://image.tmdb.org/t/p/w300/etc6HKBEhNySNnYU2nRgbSeIyoW.jpg","Bastardos Inglorios","3213213","321321321"),
                Movie("https://image.tmdb.org/t/p/w300/etc6HKBEhNySNnYU2nRgbSeIyoW.jpg","Bastardos Inglorios","3213213","321321321"),
                Movie("https://image.tmdb.org/t/p/w300/etc6HKBEhNySNnYU2nRgbSeIyoW.jpg","Bastardos Inglorios","3213213","321321321"),
                Movie("https://image.tmdb.org/t/p/w300/etc6HKBEhNySNnYU2nRgbSeIyoW.jpg","Bastardos Inglorios","3213213","321321321")
            )
        )
    }

    private fun configureRecyclerView() {
        binding.rcvMovies.apply {
            setHasFixedSize(true)
            adapter = moviesAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}