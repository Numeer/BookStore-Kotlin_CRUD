package com.nomisapplication.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.nomisapplication.app.R
import com.nomisapplication.app.models.Book
import com.nomisapplication.app.appcomponents.base.BaseActivity
import com.nomisapplication.app.appcomponents.network.BookApi
import com.nomisapplication.app.databinding.ActivitySignupBinding
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
  private val api: BookApi = Retrofit.Builder()
    .baseUrl("http://10.0.2.2:8000")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    .create(BookApi::class.java)
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_signup)

    api.getAllBooks().enqueue(object : Callback<List<Book>> {
      override fun onResponse(call: Call<List<Book>>, response: Response<List<Book>>) {
        if (response.isSuccessful) {
          val books = response.body()
          Log.d("MainActivity","$books")
        }
      }

      override fun onFailure(call: Call<List<Book>>, t: Throwable) {
        // Handle network error
        Log.e("MainActivity", "Error getting books", t)
      }
    })
  }
  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
    binding.btnSignup.setOnClickListener {
      val destIntent = MainpageActivity.getIntent(this, null)
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
