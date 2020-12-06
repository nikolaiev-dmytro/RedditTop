package com.nikolaiev.reddittop.model


import com.google.gson.annotations.SerializedName

data class ArticleData(
    @SerializedName("author")
    var author: String?,
    @SerializedName("author_fullname")
    var authorFullname: String?,
    @SerializedName("created")
    var created: Double?,
    @SerializedName("created_utc")
    var createdUtc: Double?,
    @SerializedName("id")
    var id: String?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("num_comments")
    var numComments: Int?,
    @SerializedName("thumbnail")
    var thumbnail: String?,
    @SerializedName("thumbnail_height")
    var thumbnailHeight: Int?,
    @SerializedName("thumbnail_width")
    var thumbnailWidth: Int?,
    @SerializedName("title")
    var title: String?,
    @SerializedName("url")
    var url: String?,
    @SerializedName("url_overridden_by_dest")
    var urlOverriddenByDest: String?,
    @SerializedName("view_count")
    var viewCount: Int?
)