package com.nomisapplication.app.modules.frametwelve.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.util.Log
import androidx.activity.viewModels
import com.nomisapplication.app.MainActivityF
import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.base.BaseActivity
import com.nomisapplication.app.appcomponents.network.BookApi
import com.nomisapplication.app.databinding.ActivityFrameTwelveBinding
import com.nomisapplication.app.modules.bookone.data.model.BookoneModel
import com.nomisapplication.app.modules.frametwelve.`data`.viewmodel.FrameTwelveVM
import com.nomisapplication.app.modules.mainpage.ui.MainpageActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FrameTwelveActivity : BaseActivity<ActivityFrameTwelveBinding>(R.layout.activity_frame_twelve)
    {
  private val viewModel: FrameTwelveVM by viewModels<FrameTwelveVM>()

  private val REQUEST_CODE_MAINPAGE_ACTIVITY: Int = 823

  override fun onInitialized(): Unit {

    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val bookoneModel:BookoneModel? = intent.getParcelableExtra<BookoneModel>("BOOKONE_MODEL")
    viewModel.bookoneModel.value = bookoneModel

    binding.frameTwelveVM = viewModel

    bookoneModel?.let {
      binding.UpdateAuthor.setText(it.txtRICKRIORDAN ?: "")
      binding.UpdateName.setText(it.txtTHETRIALSOFA ?: "")

      val price = it.txtPrice?.split("$")
      binding.UpdatePrice.setText(price?.get(1)?: "")

      val gen = it.txtDescription?.split(" :")
      binding.UpdateGenre.setText(gen?.get(1) ?: "")

      val lang = it.txtLanguageOne?.split(" :")
      binding.UpdatedLanguage.setText(lang?.get(1) ?:  "")

      val parts = it.txtLanguage?.split(" :")
      binding.UpdateNoOfPages.setText(parts?.get(1) ?: "")

      val pub = it.txtLanguageTwo ?.split(" :")
      binding.UpdatedPublished.setText(pub?.get(1) ?: "")

      binding.UpdateDescription.setText(it.txtDescriptionOne ?: "")
    }
  }
      private val api: BookApi = Retrofit.Builder()
        .baseUrl("http://10.0.2.2:8000")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(BookApi::class.java)
  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = MainActivityF.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.txtLanguageTwo.setOnClickListener {
      val author = binding.UpdateAuthor.text.toString()
      val name = binding.UpdateName.text.toString()
      val price = binding.UpdatePrice.text.toString()
      val genre = binding.UpdateGenre.text.toString()
      val language = binding.UpdatedLanguage.text.toString()
      val noOfPages = binding.UpdateNoOfPages.text.toString()
      val published = binding.UpdatedPublished.text.toString()
      val description = binding.UpdateDescription.text.toString()

      val call = api.updateBook(
        name,author,price,noOfPages,language,genre,description,published
      )

      call.enqueue(object : Callback<Void> {
        override fun onResponse(call: Call<Void>, response: Response<Void>) {
          if (response.code()==200) {
            Log.d("Frame12","Updated Successfully")

          } else {
            Log.d("Frame12","Not Updated :) ")
          }
        }

        override fun onFailure(call: Call<Void>, t: Throwable) {
          Log.d("Frame12", "Error updating book")
        }
      })


      val destIntent = MainActivityF.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_TWELVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameTwelveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
