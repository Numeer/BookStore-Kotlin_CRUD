package com.nomisapplication.app.models
import com.google.gson.annotations.SerializedName
data class Book(
    @SerializedName("name")
    val name : String,
    @SerializedName("author")
    val author : String,
    @SerializedName("price")
    val price : Int,
    @SerializedName("number_of_pages")
    val noOfPages : Int,
    @SerializedName("language")
    val language : String,
    @SerializedName("genre")
    val genre : String,
    @SerializedName("published")
    val published : String,
    @SerializedName("description")
    val description : String
)
