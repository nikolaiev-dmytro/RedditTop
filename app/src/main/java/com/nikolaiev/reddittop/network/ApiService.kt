package com.nikolaiev.reddittop.network

import com.nikolaiev.reddittop.model.TopRedditResponse
import retrofit2.http.GET

interface ApiService {

    @GET("top.json")
    fun getTopArticles(): io.reactivex.rxjava3.core.Single<TopRedditResponse>
}