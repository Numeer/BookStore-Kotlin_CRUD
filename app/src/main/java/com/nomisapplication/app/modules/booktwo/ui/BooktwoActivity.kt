package com.nomisapplication.app.modules.booktwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.base.BaseActivity
import com.nomisapplication.app.databinding.ActivityBooktwoBinding
import com.nomisapplication.app.modules.booktwo.`data`.viewmodel.BooktwoVM
import com.nomisapplication.app.modules.frametwelve.ui.FrameTwelveActivity
import com.nomisapplication.app.modules.mainpage.ui.MainpageActivity
import com.nomisapplication.app.modules.payment.ui.PaymentActivity
import kotlin.String
import kotlin.Unit

class BooktwoActivity : BaseActivity<ActivityBooktwoBinding>(R.layout.activity_booktwo) {
  private val viewModel: BooktwoVM by viewModels<BooktwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.booktwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageDeleteOne.setOnClickListener {
      val destIntent = MainpageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtUpdate.setOnClickListener {
      val destIntent = FrameTwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowaddtocart.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BOOKTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BooktwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
