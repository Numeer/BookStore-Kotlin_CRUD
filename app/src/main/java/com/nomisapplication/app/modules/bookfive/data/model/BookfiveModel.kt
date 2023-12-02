package com.nomisapplication.app.modules.bookfive.`data`.model

import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BookfiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBookDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_book_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_rachel_timothy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_open_blind_eyes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_410_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUpdate: String? = MyApp.getInstance().resources.getString(R.string.lbl_update)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_number_of_pages5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_language2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_published5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.msg_genre5)
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
      MyApp.getInstance().resources.getString(R.string.msg_open_blind_eyes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQTY: String? = MyApp.getInstance().resources.getString(R.string.lbl_qty)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEleven: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtADDTOCART: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_to_cart)

)
