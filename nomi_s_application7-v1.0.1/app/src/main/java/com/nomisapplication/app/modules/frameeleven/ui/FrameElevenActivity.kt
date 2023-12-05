package com.nomisapplication.app.modules.frameeleven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.base.BaseActivity
import com.nomisapplication.app.appcomponents.network.BookApi
import com.nomisapplication.app.databinding.ActivityFrameElevenBinding
import com.nomisapplication.app.modules.frameeleven.`data`.viewmodel.FrameElevenVM
import com.nomisapplication.app.modules.mainpage.ui.MainpageActivity
import kotlin.String
import kotlin.Unit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
class FrameElevenActivity : BaseActivity<ActivityFrameElevenBinding>(R.layout.activity_frame_eleven)
    {
  private val viewModel: FrameElevenVM by viewModels<FrameElevenVM>()
  var success = 0
      override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameElevenVM = viewModel
  }
      private val api: BookApi = Retrofit.Builder()
        .baseUrl("http://10.0.2.2:8000")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(BookApi::class.java)
      override fun setUpClicks(): Unit {
    binding.txtLanguageTwo.setOnClickListener {
      val author = binding.addAuthor.text.toString()
      val name = binding.addName.text.toString()
      val price = binding.addPrice.text.toString()
      val genre = binding.addGenre.text.toString()
      val language = binding.addLanguage.text.toString()
      val noOfPages = binding.addNoOfPages.text.toString()
      val published = binding.addPublished.text.toString()
      val description = binding.addDescription.text.toString()

      val call = api.addBook(
        name,author,price,noOfPages,language,genre,description,published
      )
      Log.d("YourActivity", "Author: $author")
      Log.d("YourActivity", "Name: $name")
      Log.d("YourActivity", "Price: $price")
      Log.d("YourActivity", "Genre: $genre")
      Log.d("YourActivity", "Language: $language")
      Log.d("YourActivity", "No of Pages: $noOfPages")
      Log.d("YourActivity", "Published: $published")
      Log.d("YourActivity", "Description: $description")
      call.enqueue(object : Callback<Void> {
        override fun onResponse(call: Call<Void>, response: Response<Void>) {
          if (response.isSuccessful) {
            success = 1
            Log.d("YourActivity","Success: $success")
          } else {

          }
        }

        override fun onFailure(call: Call<Void>, t: Throwable) {

        }
      })

        val destIntent = MainpageActivity.getIntent(this, null)
        startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      val destIntent = MainpageActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
  }

  companion object {
    const val TAG: String = "FRAME_ELEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameElevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
