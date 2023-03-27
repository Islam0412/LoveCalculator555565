package com.example.lovecalculator.remote


import com.example.lovecalculator.model.LoveModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {
    @GET("getPercentage")
    fun getPercentage(
        @Query("fname") fistName: String,
        @Query("sname") second: String,
        @Header("X-RapidAPI-Key") key: String = "7ec17c1e04mshb7aee483aac74a4p1489e2jsn8a69a07960c0",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com"
    ): Call<LoveModel>

}