package com.nomisapplication.app.modules.bookone.`data`.model

import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BookoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBookDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_book_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRICKRIORDAN: String? = MyApp.getInstance().resources.getString(R.string.lbl_rick_riordan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTHETRIALSOFA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_trials_of_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_300_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_update)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_number_of_pages)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_published)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_genre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeascription: String? = MyApp.getInstance().resources.getString(R.string.lbl_deascription)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_trials_of_a2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQTY: String? = MyApp.getInstance().resources.getString(R.string.lbl_qty)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtADDTOCART: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_to_cart)

)
