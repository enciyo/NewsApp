package com.newsapp.enciyo.haberapp.ui

import com.newsapp.enciyo.haberapp.base.BaseView
import com.newsapp.enciyo.haberapp.data.IDataManager
import com.newsapp.enciyo.haberapp.data.model.News

interface MainView : BaseView<MainBasePresenter,IDataManager> {

    fun showNews(news:News)

}