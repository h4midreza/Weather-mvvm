package com.example.repository

import com.example.data.ApiService

class WeatherRepository(private val api: ApiService) {
    fun getCurrentWeather(lat: Double, lon: Double, unit: String) =
        api.getCurrentWeather(lat, lon, unit, "f0db66f720538124845826b46c705a4a")

    fun getForecastWeather(lat: Double, lon: Double, unit: String) =
        api.getForecastWeather(lat, lon, unit, "f0db66f720538124845826b46c705a4a")
}