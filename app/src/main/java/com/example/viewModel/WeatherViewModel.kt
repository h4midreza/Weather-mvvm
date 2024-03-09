package com.example.viewModel

import androidx.lifecycle.ViewModel
import com.example.data.ApiService
import com.example.network.ApiClient
import com.example.repository.WeatherRepository

class WeatherViewModel(val repository: WeatherRepository) : ViewModel() {
    constructor() : this(WeatherRepository(ApiClient().getClient().create(ApiService::class.java)))

    fun loadCurrentWeather(lat: Double, lon: Double, unit: String) =
        repository.getCurrentWeather(lat, lon, unit)

    fun loadForecastWeather(lat: Double, lon: Double, unit: String) =
        repository.getForecastWeather(lat, lon, unit)
}