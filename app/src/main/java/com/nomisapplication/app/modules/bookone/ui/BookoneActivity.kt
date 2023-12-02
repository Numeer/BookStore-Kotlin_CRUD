package com.nomisapplication.app.modules.bookone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.base.BaseActivity
import com.nomisapplication.app.databinding.ActivityBookoneBinding
import com.nomisapplication.app.modules.bookone.`data`.viewmodel.BookoneVM
import com.nomisapplication.app.modules.frametwelve.ui.FrameTwelveActivity
import com.nomisapplication.app.modules.mainpage.ui.MainpageActivity
import com.nomisapplication.app.modules.payment.ui.PaymentActivity
import kotlin.String
import kotlin.Unit

class BookoneActivity : BaseActivity<ActivityBookoneBinding>(R.layout.activity_bookone) {
  private val viewModel: BookoneVM by viewModels<BookoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bookoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageDeleteTwo.setOnClickListener {
      val destIntent = MainpageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowaddtocart.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupFortyOne.setOnClickListener{
      val destIntent = FrameTwelveActivity.getIntent(this, null)
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
