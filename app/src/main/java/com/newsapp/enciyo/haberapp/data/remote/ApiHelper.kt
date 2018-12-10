package com.newsapp.enciyo.haberapp.data.remote

import com.newsapp.enciyo.haberapp.data.model.News
import retrofit2.Call
import retrofit2.http.GET

interface ApiHelper{
    @GET("v2/top-headlines?country=tr&apiKey=548a48ee94b3421a900177a1de1dad7d")
    fun getTopNews(): Call<News>
}