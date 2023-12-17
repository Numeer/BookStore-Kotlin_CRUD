package com.nomisapplication.app.modules.bookone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.nomisapplication.app.MainActivityF
import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.base.BaseActivity
import com.nomisapplication.app.appcomponents.network.BookApi
import com.nomisapplication.app.databinding.ActivityBookoneBinding
import com.nomisapplication.app.modules.bookone.data.model.BookoneModel
import com.nomisapplication.app.modules.bookone.`data`.viewmodel.BookoneVM
import com.nomisapplication.app.modules.frametwelve.ui.FrameTwelveActivity
import com.nomisapplication.app.modules.mainpage.ui.MainpageActivity
import com.nomisapplication.app.modules.payment.ui.PaymentActivity
//import kotlinx.coroutines.flow.internal.NoOpContinuation.context
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.String
import kotlin.Unit
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

class BookoneActivity : BaseActivity<ActivityBookoneBinding>(R.layout.activity_bookone) {
  private val viewModel: BookoneVM by viewModels<BookoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val bookoneModel = intent.getParcelableExtra<BookoneModel>("BOOKONE_MODEL")
    viewModel.bookoneModel.value = bookoneModel

    val imageUrl = bookoneModel?.imageImageOne
    Log.d("Helaaaa","${imageUrl}")
    if (bookoneModel != null) {
      Glide.with(this)
        .load(imageUrl)
        .placeholder(R.drawable.img_image11)
        .error(R.drawable.img_image11)
        .into(binding.imageImageOne)
    }

    binding.bookoneVM = viewModel
    binding.txtRICKRIORDAN.text = bookoneModel?.txtRICKRIORDAN ?: ""
    binding.txtTHETRIALSOFA.text = bookoneModel?.txtTHETRIALSOFA ?: ""
    binding.txtPrice.text = bookoneModel?.txtPrice ?: ""
    binding.txtLanguage.text = bookoneModel?.txtLanguage ?: ""
    binding.txtLanguageOne.text = bookoneModel?.txtLanguageOne ?: ""
    binding.txtLanguageTwo.text = bookoneModel?.txtLanguageTwo ?: ""
    binding.txtDescription.text = bookoneModel?.txtDescription ?: ""
    binding.txtDescriptionOne.text = bookoneModel?.txtDescriptionOne ?: ""
  }

  override fun setUpClicks(): Unit {
    binding.imageDeleteTwo.setOnClickListener {
      val bookName = binding.txtTHETRIALSOFA.text.toString()
      Log.d("BookName","${bookName}")
      var success = 0
      val api: BookApi = Retrofit.Builder()
        .baseUrl("http://172.26.7.68:8000")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(BookApi::class.java)

      val call = api.deleteBook(bookName)
      call.enqueue(object : Callback<String> {
        override fun onResponse(call: Call<String>, response: Response<String>) {
          if (response.code() == 200) {
            success = 1
            Log.d("SUCCESS" ,"${success}")
          } else {
            Log.e("DeleteBook", "Failed to delete book: ${response.code()}")
          }
        }

        override fun onFailure(call: Call<String>, t: Throwable) {

        }
      })

        Toast.makeText(this, "Book deleted successfully", Toast.LENGTH_LONG).show()
        val destIntent = MainActivityF.getIntent(this, null)
        startActivity(destIntent)

    }
    binding.linearRowaddtocart.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupFortyOne.setOnClickListener{
//      val bookoneModel = viewModel.bookoneModel.value
//      Log.d("BookoneActivity", "bookoneModel: $bookoneModel")
//
//      val bundle = Bundle().apply {
//        putParcelable("BOOKONE_MODEL", bookoneModel)
//      }
//      val destIntent = FrameTwelveActivity.getIntent(this, bundle)
//      startActivity(destIntent)
      val bookoneModel = viewModel.bookoneModel.value
      val destIntent = FrameTwelveActivity.getIntent(this@BookoneActivity, null)
      destIntent.putExtra("BOOKONE_MODEL", bookoneModel)
      startActivity(destIntent)
    }

  }

  companion object {
    const val TAG: String = "BOOKONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BookoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
