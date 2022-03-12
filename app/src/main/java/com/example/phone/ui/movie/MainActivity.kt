package com.example.phone.ui.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.phone.R
import com.example.phone.databinding.ActivityMainBinding
import com.example.phone.ui.utils.base.RVModelBindingAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.rvMovieList.adapter = RVModelBindingAdapter(
            emptyList(),
            viewModel,
            MovieVHFactory()
        )


        viewModel.getPopularMovieList()

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.viewState.collect { uiState ->
                    when (uiState) {
                        is MainViewState.Initial -> {
                        }
                        is MainViewState.Success -> {
                        }
                        is MainViewState.Failure -> {

                        }
                    }
                }
            }
        }
    }
}