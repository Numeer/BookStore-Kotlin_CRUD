package com.nomisapplication.app.modules.firstpage.`data`.model

import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FirstpageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWELLCOMETo: String? = MyApp.getInstance().resources.getString(R.string.lbl_wellcome_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKitab: String? = MyApp.getInstance().resources.getString(R.string.lbl_kitab)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_signup)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwentyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)

)
