package com.newsapp.enciyo.haberapp.data.remote

import org.jetbrains.annotations.NotNull
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    private val baseUrl = "https://newsapi.org/"
    private val restApi:ApiHelper

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        restApi =retrofit.create(ApiHelper::class.java)
    }

    @NotNull
    fun getApi() : ApiHelper {
        return restApi
    }




    }




