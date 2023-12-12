package com.nomisapplication.app.models

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nomisapplication.app.R
import com.nomisapplication.app.models.Book
import com.nomisapplication.app.modules.bookone.ui.BookoneActivity
import com.nomisapplication.app.modules.bookone.data.model.BookoneModel

class BookAdapter(private val context: Context) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    private var books: List<Book>? = null

    fun setBooks(books: List<Book>?) {
        this.books = books
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books?.get(position)
        if (book != null) {
            holder.bind(book)
            var noOfPages = "No Of Pages : "
            noOfPages += book.fields.numberOfPages

            var lang = "Language : "
            lang += book.fields.language

            var publish = "Published : "
            publish += book.fields.published

            var genre = "Genre : "
            genre += book.fields.genre

            var price = "$"
            price += book.fields.price
            val bookoneModel = BookoneModel(
                txtTHETRIALSOFA = book.name,
                txtRICKRIORDAN = book.fields.author,
                txtPrice = price,
                txtLanguage = noOfPages,
                txtLanguageOne = lang,
                txtLanguageTwo = publish,
                txtDescription = genre,
                txtDescriptionOne = book.fields.description
                )
            holder.itemView.setOnClickListener {
                Log.d("Adapter", "Name: ${book.name}")
                Log.d("Adapter", "Author: ${book.fields.author}")

                val intent = Intent(context, BookoneActivity::class.java)
                intent.putExtra("BOOKONE_MODEL", bookoneModel)
                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return books?.size ?: 0
    }

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.textViewBookName)
        private val authorTextView: TextView = itemView.findViewById(R.id.textViewAuthor)
        private val coverImageView: ImageView = itemView.findViewById(R.id.imageViewBook)

        fun bind(book: Book) {
            nameTextView.text = "Book Name: ${book.name}"
            authorTextView.text = "Author: ${book.fields.author}"
//            Glide.with(itemView)
//                .load(book.fields.coverImage) // Assuming coverImage is the URL or resource ID of the image
//                .into(coverImageView)

        }
    }
}
