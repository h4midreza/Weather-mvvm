package com.example.viewModel

import androidx.lifecycle.ViewModel
import com.example.data.ApiService
import com.example.network.ApiClient
import com.example.repository.CityRepository

class CityViewModel(private val repository: CityRepository): ViewModel() {
    constructor(): this(CityRepository(ApiClient().getClient().create(ApiService::class.java)))

    fun loadCity(q: String, limit: Int) =
        repository.getCities(q,limit)
}