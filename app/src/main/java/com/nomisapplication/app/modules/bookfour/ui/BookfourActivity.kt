package com.nomisapplication.app.modules.bookfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.base.BaseActivity
import com.nomisapplication.app.databinding.ActivityBookfourBinding
import com.nomisapplication.app.modules.bookfour.`data`.viewmodel.BookfourVM
import com.nomisapplication.app.modules.frametwelve.ui.FrameTwelveActivity
import com.nomisapplication.app.modules.mainpage.ui.MainpageActivity
import com.nomisapplication.app.modules.payment.ui.PaymentActivity
import kotlin.String
import kotlin.Unit

class BookfourActivity : BaseActivity<ActivityBookfourBinding>(R.layout.activity_bookfour) {
  private val viewModel: BookfourVM by viewModels<BookfourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bookfourVM = viewModel
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
    binding.txtGroupOne.setOnClickListener{
      val destIntent = FrameTwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BOOKFOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BookfourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
