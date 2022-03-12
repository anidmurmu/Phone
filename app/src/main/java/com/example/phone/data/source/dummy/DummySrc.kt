package com.example.phone.data.source.dummy

import com.example.phone.data.entity.DummySrcModel
import javax.inject.Inject

class DummySrc @Inject constructor() {
    fun getDummyData(): Result<DummySrcModel> {
        val data = DummySrcModel("keyFromDataModule", "valueFromDataModule")
        return Result.success(data)
    }
}