package com.nomisapplication.app.modules.frameeleven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.base.BaseActivity
import com.nomisapplication.app.databinding.ActivityFrameElevenBinding
import com.nomisapplication.app.modules.frameeleven.`data`.viewmodel.FrameElevenVM
import com.nomisapplication.app.modules.mainpage.ui.MainpageActivity
import kotlin.String
import kotlin.Unit

class FrameElevenActivity : BaseActivity<ActivityFrameElevenBinding>(R.layout.activity_frame_eleven)
    {
  private val viewModel: FrameElevenVM by viewModels<FrameElevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameElevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLanguageTwo.setOnClickListener {
      val destIntent = MainpageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
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
