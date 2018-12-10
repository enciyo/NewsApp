package com.newsapp.enciyo.haberapp.base


interface BaseView<T,D>{

    var presenter:T
    var dataManager : D

}