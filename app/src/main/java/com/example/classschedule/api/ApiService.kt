package com.example.classschedule.api

import com.example.classschedule.ResponseClass
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("telyuclasses")
    fun getData(): Call<ResponseClass>
}