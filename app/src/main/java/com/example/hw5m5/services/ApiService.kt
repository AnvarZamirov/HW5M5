package com.example.hw5m5.services


import com.example.hw5m5.model.PercentageModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


interface  ApiService {

    @GET("getPercentage")
    fun fetchPercentage(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("x-rapidapi-key") key: String,
        @Header("x-rapidapi-host") host: String
    ): Call<PercentageModel>
}