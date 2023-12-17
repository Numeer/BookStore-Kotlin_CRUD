package com.nomisapplication.app.modules.bookone.`data`.model

import android.os.Parcel
import android.os.Parcelable
import android.widget.ImageView
import com.nomisapplication.app.R
import com.nomisapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BookoneModel(
  var imageImageOne: String? = "Image",
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

) : Parcelable {

  override fun writeToParcel(parcel: Parcel, flags: Int) {
    parcel.writeString(txtRICKRIORDAN)
    parcel.writeString(txtTHETRIALSOFA)
    parcel.writeString(txtPrice)
    parcel.writeString(txtLanguage)
    parcel.writeString(txtLanguageOne)
    parcel.writeString(txtLanguageTwo)
    parcel.writeString(txtDescription)
    parcel.writeString(txtDescriptionOne)
    parcel.writeString(imageImageOne)
    // Write other properties...
  }

  override fun describeContents(): Int {
    return 0
  }

  companion object CREATOR : Parcelable.Creator<BookoneModel> {
    override fun createFromParcel(parcel: Parcel): BookoneModel {
      return BookoneModel(parcel)
    }

    override fun newArray(size: Int): Array<BookoneModel?> {
      return arrayOfNulls(size)
    }
  }

  private constructor(parcel: Parcel) : this(
    txtRICKRIORDAN = parcel.readString(),
    txtTHETRIALSOFA = parcel.readString(),
    txtPrice = parcel.readString(),
    txtLanguage = parcel.readString(),
    txtLanguageOne = parcel.readString(),
    txtLanguageTwo = parcel.readString(),
    txtDescription = parcel.readString(),
    txtDescriptionOne = parcel.readString(),
    imageImageOne = parcel.readString(),
  )
}

