package com.newsapp.enciyo.haberapp.data

import android.util.Log
import com.newsapp.enciyo.haberapp.data.model.News
import com.newsapp.enciyo.haberapp.data.remote.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataManager : IDataManager {
    override fun getNewsList(onFinishedListener: IDataManager.OnFinishedListener) {
        val apiService = ApiClient()
            apiService.getApi().getTopNews().enqueue(object: Callback<News>{
                override fun onFailure(call: Call<News>, t: Throwable) {
                   onFinishedListener.onFailure(t)
                    Log.i("Data","Failed")
                }

                override fun onResponse(call: Call<News>, response: Response<News>) {
                    onFinishedListener.onFinished(response.body()!!)
                    Log.i("Data","Succes")
                }
            })
    }


}