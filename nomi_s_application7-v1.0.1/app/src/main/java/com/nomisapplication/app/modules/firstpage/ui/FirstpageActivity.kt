package com.nomisapplication.app.modules.firstpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.base.BaseActivity
import com.nomisapplication.app.databinding.ActivityFirstpageBinding
import com.nomisapplication.app.modules.firstpage.`data`.viewmodel.FirstpageVM
import com.nomisapplication.app.modules.login.ui.LoginActivity
import com.nomisapplication.app.modules.signup.ui.SignupActivity
import kotlin.String
import kotlin.Unit

class FirstpageActivity : BaseActivity<ActivityFirstpageBinding>(R.layout.activity_firstpage) {
  private val viewModel: FirstpageVM by viewModels<FirstpageVM>()

  override fun onInitialized(): Unit {

    Toast.makeText(baseContext, "Sign Up successfully", Toast.LENGTH_LONG).show()
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.firstpageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtGroupTwentyTwo.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtGroupTwentyThree.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FIRSTPAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FirstpageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
