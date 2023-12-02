package com.nomisapplication.app.modules.bookthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.base.BaseActivity
import com.nomisapplication.app.databinding.ActivityBookthreeBinding
import com.nomisapplication.app.modules.bookthree.`data`.viewmodel.BookthreeVM
import com.nomisapplication.app.modules.frametwelve.ui.FrameTwelveActivity
import com.nomisapplication.app.modules.mainpage.ui.MainpageActivity
import com.nomisapplication.app.modules.payment.ui.PaymentActivity
import kotlin.String
import kotlin.Unit

class BookthreeActivity : BaseActivity<ActivityBookthreeBinding>(R.layout.activity_bookthree) {
  private val viewModel: BookthreeVM by viewModels<BookthreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bookthreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageDeleteThree.setOnClickListener {
      val destIntent = MainpageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowaddtocart.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupThirtyOne.setOnClickListener{
      val destIntent = FrameTwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BOOKTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BookthreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
