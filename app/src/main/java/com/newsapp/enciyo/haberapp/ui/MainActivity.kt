package com.newsapp.enciyo.haberapp.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.newsapp.enciyo.haberapp.R
import com.newsapp.enciyo.haberapp.adapter.NewsAdapter
import com.newsapp.enciyo.haberapp.data.DataManager
import com.newsapp.enciyo.haberapp.data.IDataManager
import com.newsapp.enciyo.haberapp.data.model.News
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),MainView {
    override fun showNews(news: News) {
        val adapter= NewsAdapter(this,news.articles!!)
        val layoutManager= LinearLayoutManager(this)
        layoutManager.orientation=LinearLayoutManager.VERTICAL
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=adapter

    }


    override lateinit var presenter: MainBasePresenter
    override lateinit var dataManager: IDataManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.dataManager=DataManager()
        this.presenter=MainPresenter(this,dataManager)
        presenter.loadNews()




    }

}
