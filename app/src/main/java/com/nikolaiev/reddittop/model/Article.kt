package com.nikolaiev.reddittop.model


import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("data")
    var `data`: ArticleData?,
    @SerializedName("kind")
    var kind: String?
)