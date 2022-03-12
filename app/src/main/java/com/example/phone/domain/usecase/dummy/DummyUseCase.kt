package com.example.phone.domain.usecase.dummy

import com.example.phone.domain.model.dummy.DummyUiModel
import com.example.phone.domain.repository.DummyRepository
import javax.inject.Inject

interface GetDummyDataUseCase {
    suspend fun getDummyData(): Result<DummyUiModel>
}

class GetDummyDataUseCaseImpl @Inject constructor(
    private val dummyRepository: DummyRepository
) : GetDummyDataUseCase {
    override suspend fun getDummyData(): Result<DummyUiModel> {
        return dummyRepository.getDummyData()
    }
}