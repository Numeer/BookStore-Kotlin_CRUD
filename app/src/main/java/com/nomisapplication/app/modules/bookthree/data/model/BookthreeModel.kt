package com.nomisapplication.app.modules.bookthree.`data`.model

import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BookthreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBookDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_book_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEMILYSTJOHNM: String? =
      MyApp.getInstance().resources.getString(R.string.msg_emily_st_john_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTHEGLASSHOTEL: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_glass_hotel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_200_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_update)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_number_of_pages3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_published3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.msg_genre3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeascription: String? = MyApp.getInstance().resources.getString(R.string.lbl_deascription)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_glass_hotel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQTY: String? = MyApp.getInstance().resources.getString(R.string.lbl_qty)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSix: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtADDTOCART: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_to_cart)

)
