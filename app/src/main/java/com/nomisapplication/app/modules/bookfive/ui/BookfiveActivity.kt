package com.nomisapplication.app.modules.bookfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.base.BaseActivity
import com.nomisapplication.app.databinding.ActivityBookfiveBinding
import com.nomisapplication.app.modules.bookfive.`data`.viewmodel.BookfiveVM
import com.nomisapplication.app.modules.frametwelve.ui.FrameTwelveActivity
import com.nomisapplication.app.modules.mainpage.ui.MainpageActivity
import com.nomisapplication.app.modules.payment.ui.PaymentActivity
import kotlin.String
import kotlin.Unit

class BookfiveActivity : BaseActivity<ActivityBookfiveBinding>(R.layout.activity_bookfive) {
  private val viewModel: BookfiveVM by viewModels<BookfiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bookfiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowaddtocart.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageDeleteThree.setOnClickListener {
      val destIntent = MainpageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtUpdate.setOnClickListener {
      val destIntent = FrameTwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BOOKFIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BookfiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
