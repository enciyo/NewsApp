package com.newsapp.enciyo.haberapp.data

import com.newsapp.enciyo.haberapp.data.model.News

interface IDataManager{

    interface OnFinishedListener{
        fun onFinished(news: News)
        fun onFailure(t: Throwable)
    }
    fun getNewsList(onFinishedListener: OnFinishedListener)
}