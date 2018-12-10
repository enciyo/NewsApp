package com.newsapp.enciyo.haberapp.ui


import com.newsapp.enciyo.haberapp.data.IDataManager
import com.newsapp.enciyo.haberapp.data.model.News

class MainPresenter(val mainView: MainView,val dataManager:IDataManager) : MainBasePresenter,
    IDataManager.OnFinishedListener {


    override fun loadNews() {
        dataManager.getNewsList(this)

    }

    override fun start() {

    }

    override fun onFinished(news: News) {
        mainView.showNews(news)

    }

    override fun onFailure(t: Throwable) {
        print("sada")
    }

}