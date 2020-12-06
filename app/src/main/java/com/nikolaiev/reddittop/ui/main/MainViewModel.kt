package com.nikolaiev.reddittop.ui.main

import androidx.lifecycle.ViewModel
import com.nikolaiev.reddittop.model.TopRedditResponse
import com.nikolaiev.reddittop.network.NetworkManager
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import io.reactivex.rxjava3.schedulers.Schedulers

class MainViewModel : ViewModel() {


    private var articlesObserver: DisposableSingleObserver<TopRedditResponse>? = null

    init {
        fetchTopArticles()
    }

    private fun fetchTopArticles() {
        articlesObserver = object : DisposableSingleObserver<TopRedditResponse>() {
            override fun onSuccess(response: TopRedditResponse?) {
                response?.let {

                } ?: return

            }

            override fun onError(e: Throwable?) {
            }

        }
        NetworkManager.apiService.getTopArticles()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(articlesObserver)

    }

    override fun onCleared() {
        articlesObserver?.dispose()
        super.onCleared()
    }
}