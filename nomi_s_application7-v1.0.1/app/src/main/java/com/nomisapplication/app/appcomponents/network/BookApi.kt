package com.nomisapplication.app.appcomponents.network
import com.nomisapplication.app.models.Book
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Query

interface BookApi {
    @GET("/addBook")
    fun addBook(
        @Query("name") name: String,
        @Query("author") author: String,
        @Query("price") price: String,
        @Query("noOfPages") noOfPages: String,
        @Query("language") language: String,
        @Query("genre") genre: String,
        @Query("description") description: String,
        @Query("published") published: String
    ): Call<Void>

    @GET("/updateBook")
    fun updateBook(
        @Query("name") name: String,
        @Query("author") author: String,
        @Query("price") price: String,
        @Query("noOfPages") noOfPages: String,
        @Query("language") language: String,
        @Query("genre") genre: String,
        @Query("description") description: String,
        @Query("published") published: String
    ): Call<Void>

    @GET("/allBooks")
    fun getAllBooks(): Call<List<Book>>

    @GET("/delBook")
    fun deleteBook(@Query("name") name: String): Call<String>
}