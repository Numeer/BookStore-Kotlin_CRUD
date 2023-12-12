package com.nomisapplication.app.modules.mainpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.base.BaseActivity
import com.nomisapplication.app.appcomponents.network.BookApi
import com.nomisapplication.app.databinding.ActivityMainpageBinding
import com.nomisapplication.app.models.Book
import com.nomisapplication.app.modules.bookfive.ui.BookfiveActivity
import com.nomisapplication.app.modules.bookfour.ui.BookfourActivity
import com.nomisapplication.app.modules.bookone.ui.BookoneActivity
import com.nomisapplication.app.modules.bookthree.ui.BookthreeActivity
import com.nomisapplication.app.modules.booktwo.ui.BooktwoActivity
import com.nomisapplication.app.modules.frameeleven.ui.FrameElevenActivity
import com.nomisapplication.app.modules.mainpage.`data`.viewmodel.MainpageVM
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.String
import kotlin.Unit

class MainpageActivity : BaseActivity<ActivityMainpageBinding>(R.layout.activity_mainpage) {
  private val viewModel: MainpageVM by viewModels<MainpageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mainpageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageImageSix.setOnClickListener {
      val destIntent = BookfiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnAddABook.setOnClickListener {
      val destIntent = FrameElevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImageFive.setOnClickListener {
      val destIntent = BookfourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImageThree.setOnClickListener {
      val destIntent = BookthreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImageTwo.setOnClickListener {
      val destIntent = BooktwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImageOne.setOnClickListener {
      val destIntent = BookoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MAINPAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MainpageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
