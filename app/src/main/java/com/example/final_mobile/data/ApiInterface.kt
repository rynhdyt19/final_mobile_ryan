package com.example.final_mobile.data

import retrofit2.http.GET

interface ApiInterface {
    @GET("weather?")
    suspend fun getCurrentWeather()
}