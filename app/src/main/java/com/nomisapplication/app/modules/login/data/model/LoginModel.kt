package com.nomisapplication.app.modules.login.`data`.model

import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)

)
