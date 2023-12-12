package com.nomisapplication.app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nomisapplication.app.appcomponents.network.BookApi
import com.nomisapplication.app.models.Book
import com.nomisapplication.app.models.BookAdapter
import com.nomisapplication.app.modules.signup.ui.SignupActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivityF : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var bookAdapter: BookAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.book_layout)

        recyclerView = findViewById(R.id.recyclerViewBooks)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        bookAdapter = BookAdapter(this)
        recyclerView?.adapter = bookAdapter

        // Fetch books from Django server and update the adapter
        fetchBooksFromServer()
    }

    private fun fetchBooksFromServer() {
        val api: BookApi = Retrofit.Builder()
            .baseUrl("http://10.0.2.2:8000")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BookApi::class.java)

        api.getAllBooks().enqueue(object : Callback<List<Book>> {
            override fun onResponse(call: Call<List<Book>>, response: Response<List<Book>>) {
                if (response.isSuccessful) {
                    val books = response.body()
                    bookAdapter?.setBooks(books)
                    if (books != null) {
                        for (book in books) {
                            Log.d("MainActivityF", "Book Name: ${book.name}")
                            Log.d("MainActivityF", "Author: ${book.fields.author}")
                            Log.d("MainActivityF", "Author: ${book.fields.coverImage}")
                        }
                    } else {
                        Log.d("MainActivityF", "No books found")
                    }
                } else {
                    Log.d("MainActivityF", "Request failed: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<List<Book>>, t: Throwable) {
                // Handle network error
                Log.e("MainActivityF", "Error getting books", t)
            }
        })
    }

    companion object {
        fun getIntent(signupActivity: SignupActivity, nothing: Bundle?): Intent? {
            val destIntent = Intent(signupActivity, MainActivityF::class.java)
            destIntent.putExtra("bundle", nothing)
            return destIntent
        }
    }
}
