package com.example.phone.data.repositoryimpl.di

import com.example.phone.data.mapper.DummyMapper
import com.example.phone.data.repositoryimpl.DummyRepositoryImpl
import com.example.phone.data.source.dummy.DummySrc
import com.example.phone.domain.repository.DummyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
class DummyRepositoryModule {

    @Provides
    @ActivityRetainedScoped
    fun provideDummyRepository(
        dummySrc: DummySrc,
        dummyMapper: DummyMapper
    ): DummyRepository {
        return DummyRepositoryImpl(
            dummySrc,
            dummyMapper
        )
    }
}