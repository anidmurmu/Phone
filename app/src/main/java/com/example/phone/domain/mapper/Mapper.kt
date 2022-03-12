package com.example.phone.domain.mapper

interface Mapper<R, D> {
    fun mapFrom(inputModel: R): D
}