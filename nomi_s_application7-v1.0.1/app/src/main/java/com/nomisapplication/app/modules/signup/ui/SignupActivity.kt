package com.nomisapplication.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.nomisapplication.app.MainActivityF
import com.nomisapplication.app.R
import com.nomisapplication.app.models.Book
import com.nomisapplication.app.appcomponents.base.BaseActivity
import com.nomisapplication.app.appcomponents.network.BookApi
import com.nomisapplication.app.databinding.ActivitySignupBinding
import com.nomisapplication.app.modules.firstpage.ui.FirstpageActivity
import com.nomisapplication.app.modules.mainpage.ui.MainpageActivity
import com.nomisapplication.app.modules.signup.`data`.viewmodel.SignupVM
import kotlin.String
import kotlin.Unit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
class SignupActivity : BaseActivity<ActivitySignupBinding>(R.layout.activity_signup) {
  private val viewModel: SignupVM by viewModels<SignupVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = FirstpageActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.btnSignup.setOnClickListener {
      val destIntent = MainActivityF.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGNUP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
