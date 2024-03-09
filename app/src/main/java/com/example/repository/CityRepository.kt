package com.example.repository

import com.example.data.ApiService

class CityRepository(val api: ApiService) {
    fun getCities(q: String, limit: Int) =
        api.getCitiesList(q,limit, "f0db66f720538124845826b46c705a4a")
}