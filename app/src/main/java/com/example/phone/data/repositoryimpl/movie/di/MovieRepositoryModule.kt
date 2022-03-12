package com.example.phone.data.repositoryimpl.movie.di

import com.example.phone.data.mapper.DummyMapper
import com.example.phone.data.mapper.movie.MovieMapper
import com.example.phone.data.repositoryimpl.DummyRepositoryImpl
import com.example.phone.data.repositoryimpl.movie.MovieRepositoryImpl
import com.example.phone.data.source.dummy.DummySrc
import com.example.phone.data.source.network.retrofit.movie.MovieSrc
import com.example.phone.domain.repository.DummyRepository
import com.example.phone.domain.repository.movie.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
class MovieRepositoryModule {

    @Provides
    @ActivityRetainedScoped
    fun provideMovieRepository(
        movieSrc: MovieSrc,
        movieMapper: MovieMapper
    ): MovieRepository {
        return MovieRepositoryImpl(
            movieSrc,
            movieMapper
        )
    }
}