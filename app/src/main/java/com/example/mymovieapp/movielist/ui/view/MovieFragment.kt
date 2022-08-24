package com.example.mymovieapp.movielist.ui.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mymovieapp.movielist.data.models.MovieAdapter
import com.example.mymovieapp.databinding.MovieFragmentBinding
import com.example.mymovieapp.movielist.data.models.Movie
import com.example.mymovieapp.utils.Status
import com.example.mymovieapp.movielist.ui.viewmodel.MovieViewModel

class MovieFragment : Fragment() {

    private var _binding: MovieFragmentBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MovieViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = MovieFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupObserver()
        setupView()
    }

    private fun setupView() {
        viewModel.getMovieData()
    }

    private fun setupObserver() {
        viewModel.movieList.observe(viewLifecycleOwner) { resource ->
            when (resource.status) {
                Status.LOADING -> {
                    showProgressBar()
                }
                Status.SUCCESS -> {
                    if (resource.data.isNullOrEmpty()) {
                        showEmptyMessage()
                    } else {
                        configureRecyclerView(resource.data)
                        showRecyclerView()
                    }
                }
                Status.ERROR -> {
                    Log.d("joao", "ERRO!!")
                    }
                }
            }
        }

    private fun configureRecyclerView(movies: List<Movie>) {

        val movieAdapter = MovieAdapter(movies)

        binding.rcvMovies.apply {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = movieAdapter
        }
    }

    private fun showEmptyMessage() {
        binding.rcvMovies.visibility = View.GONE
        binding.prgBarMovies.visibility = View.GONE
        binding.txtEmptyMessage.visibility = View.VISIBLE
    }

    private fun showProgressBar() {
        binding.rcvMovies.visibility = View.GONE
        binding.prgBarMovies.visibility = View.VISIBLE
        binding.txtEmptyMessage.visibility = View.GONE
    }

    private fun showRecyclerView() {
        binding.rcvMovies.visibility = View.VISIBLE
        binding.prgBarMovies.visibility = View.GONE
        binding.txtEmptyMessage.visibility = View.GONE
    }

}