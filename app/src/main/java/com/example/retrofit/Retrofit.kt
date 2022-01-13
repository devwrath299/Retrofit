package com.example.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object  RetrofitHelper {

    var BASE_URL="https://raw.githubusercontent.com/lukePeavey/quotable/master/data/sample/"

    fun getinstance(): Retrofit {
       return Retrofit.Builder()
           .baseUrl(BASE_URL)
           .addConverterFactory(GsonConverterFactory.create())
           .build()
    }
}