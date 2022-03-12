package com.example.phone.data.repositoryimpl

import com.example.phone.data.mapper.DummyMapper
import com.example.phone.data.source.dummy.DummySrc
import com.example.phone.domain.model.dummy.DummyUiModel
import com.example.phone.domain.repository.DummyRepository
import javax.inject.Inject

class DummyRepositoryImpl @Inject constructor(
    private val dummySrc: DummySrc,
    private val dummyMapper: DummyMapper
) : DummyRepository {
    override suspend fun getDummyData(): Result<DummyUiModel> {
        return dummyMapper.mapFrom(dummySrc.getDummyData())
    }
}