package com.example.phone.domain.repository

import com.example.phone.domain.model.dummy.DummyUiModel

interface DummyRepository {
    suspend fun getDummyData(): Result<DummyUiModel>
}