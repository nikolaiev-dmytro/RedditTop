package com.nikolaiev.reddittop.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("after")
    var after: String?,
    @SerializedName("before")
    var before: Any?,
    @SerializedName("children")
    var children: List<Article>?,
    @SerializedName("dist")
    var dist: Int?,
    @SerializedName("modhash")
    var modhash: String?
)