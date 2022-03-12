package com.example.phone.domain.usecase.movie.di

import com.example.phone.domain.repository.movie.MovieRepository
import com.example.phone.domain.usecase.movie.GetPopularMovieListUseCase
import com.example.phone.domain.usecase.movie.GetPopularMovieListUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
class MovieUseCaseModule {

    @Provides
    @ActivityRetainedScoped
    fun provideGetPopularMovieListUseCase(
        movieRepository: MovieRepository
    ): GetPopularMovieListUseCase {
        return GetPopularMovieListUseCaseImpl(movieRepository)
    }
}