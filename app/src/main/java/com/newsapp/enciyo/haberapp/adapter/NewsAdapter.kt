package com.newsapp.enciyo.haberapp.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.newsapp.enciyo.haberapp.R
import com.newsapp.enciyo.haberapp.data.model.ArticlesItem
import kotlinx.android.synthetic.main.item_list.view.*

class NewsAdapter(val context: Context, val news: List<ArticlesItem?>?) :
    RecyclerView.Adapter<NewsAdapter.NewsAdapterHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): NewsAdapterHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, p0, false)
        return NewsAdapterHolder(view!!)
    }

    override fun getItemCount(): Int {
        return news!!.size
    }

    override fun onBindViewHolder(p0: NewsAdapterHolder, p1: Int) {
        p0.setData(news!![p1])
    }

    class NewsAdapterHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun setData(item: ArticlesItem?) {
            itemView.tvHeader.text = item!!.title
            itemView.tvDesc.text = item!!.description
            Glide.with(itemView.context).load(item!!.urlToImage).into(itemView.imageView)
        }
    }

}