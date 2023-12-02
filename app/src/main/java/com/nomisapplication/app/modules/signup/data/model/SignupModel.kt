package com.nomisapplication.app.modules.signup.`data`.model

import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRegisteration: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_registeration)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFirstName: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLastName: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmPasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_passwor)

)
