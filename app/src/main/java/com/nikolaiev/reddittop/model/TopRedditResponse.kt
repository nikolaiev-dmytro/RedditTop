package com.nikolaiev.reddittop.model


import com.google.gson.annotations.SerializedName

data class TopRedditResponse(
    @SerializedName("data")
    var data: Data?
)