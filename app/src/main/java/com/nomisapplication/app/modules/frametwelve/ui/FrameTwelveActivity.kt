package com.nomisapplication.app.modules.frametwelve.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.base.BaseActivity
import com.nomisapplication.app.databinding.ActivityFrameTwelveBinding
import com.nomisapplication.app.modules.frametwelve.`data`.viewmodel.FrameTwelveVM
import com.nomisapplication.app.modules.mainpage.ui.MainpageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FrameTwelveActivity : BaseActivity<ActivityFrameTwelveBinding>(R.layout.activity_frame_twelve)
    {
  private val viewModel: FrameTwelveVM by viewModels<FrameTwelveVM>()

  private val REQUEST_CODE_MAINPAGE_ACTIVITY: Int = 823

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameTwelveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
    binding.txtLanguageTwo.setOnClickListener {
      val destIntent = MainpageActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MAINPAGE_ACTIVITY)
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
