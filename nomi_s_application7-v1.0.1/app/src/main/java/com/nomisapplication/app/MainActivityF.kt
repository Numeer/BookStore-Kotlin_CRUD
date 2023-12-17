package com.nomisapplication.app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nomisapplication.app.appcomponents.network.BookApi
import com.nomisapplication.app.models.Book
import com.nomisapplication.app.models.BookAdapter
import com.nomisapplication.app.modules.booktwo.ui.BooktwoActivity
import com.nomisapplication.app.modules.frameeleven.ui.FrameElevenActivity
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
        recyclerView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,true)
        bookAdapter = BookAdapter(this)
        recyclerView?.adapter = bookAdapter

        fetchBooksFromServer()
        val btnAddABook: AppCompatButton = findViewById(R.id.btnAddABook)

        btnAddABook.setOnClickListener {
            val intent = Intent(this, FrameElevenActivity::class.java)
            startActivity(intent)
        }

    }

    private fun fetchBooksFromServer() {
        val api: BookApi = Retrofit.Builder()
            .baseUrl("http://172.26.7.68:8000")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BookApi::class.java)

        api.getAllBooks().enqueue(object : Callback<List<Book>> {
            override fun onResponse(call: Call<List<Book>>, response: Response<List<Book>>) {
                if (response.isSuccessful) {
                    val books = response.body()
                    bookAdapter?.setBooks(books)
                    if (books != null) {

                    } else {
                        Log.d("MainActivityF", "No books found")
                    }
                } else {
                    Log.d("MainActivityF", "Request failed: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<List<Book>>, t: Throwable) {
                Log.e("MainActivityF", "Error getting books", t)
            }
        })
    }

    companion object {
        const val TAG: String = "MAIN_ACTIVITY_F"
        fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, MainActivityF::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
        }
    }
}
