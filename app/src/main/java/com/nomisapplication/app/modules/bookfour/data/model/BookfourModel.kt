package com.nomisapplication.app.modules.bookfour.`data`.model

import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BookfourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBookDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_book_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_emma_donoghve)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtROOM: String? = MyApp.getInstance().resources.getString(R.string.lbl_room)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_400_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_update)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_number_of_pages4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_published4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.msg_genre4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeascription: String? = MyApp.getInstance().resources.getString(R.string.lbl_deascription)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_room_is_a_2010)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQTY: String? = MyApp.getInstance().resources.getString(R.string.lbl_qty)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEight: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNine: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtADDTOCART: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_to_cart)

)
