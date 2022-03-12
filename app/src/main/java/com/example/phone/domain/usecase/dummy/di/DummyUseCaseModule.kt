package com.example.phone.domain.usecase.dummy.di

import com.example.phone.domain.repository.DummyRepository
import com.example.phone.domain.usecase.dummy.GetDummyDataUseCase
import com.example.phone.domain.usecase.dummy.GetDummyDataUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
class DummyUseCaseModule {

    @Provides
    @ActivityRetainedScoped
    fun provideGetDummyDataUseCase(
        dummyRepository: DummyRepository
    ): GetDummyDataUseCase {
        return GetDummyDataUseCaseImpl(dummyRepository)//dummyRepository)
    }
}