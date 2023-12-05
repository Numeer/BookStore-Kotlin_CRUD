package com.nomisapplication.app.modules.frameeleven.`data`.model

import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameElevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddbook: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_book)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAuthor: String? = MyApp.getInstance().resources.getString(R.string.lbl_author)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGenre: String? = MyApp.getInstance().resources.getString(R.string.lbl_genre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoOfPages: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_of_pages)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_published)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_add)

)
