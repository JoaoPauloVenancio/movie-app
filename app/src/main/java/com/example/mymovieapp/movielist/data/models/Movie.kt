package com.example.mymovieapp.movielist.data.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(

    @SerializedName("id")
    val id: String?,

    @SerializedName("title")
    val title: String?,

    @SerializedName("post_path")
    val post: String?,

    @SerializedName("release_date")
    val release: String?,

    ) : Parcelable {
    constructor() : this("", "", "", "")

    //tirar duvida sobre pra que serve essa interface
}