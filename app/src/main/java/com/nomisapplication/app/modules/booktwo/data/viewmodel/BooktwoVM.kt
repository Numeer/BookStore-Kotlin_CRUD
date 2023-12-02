package com.nomisapplication.app.modules.booktwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nomisapplication.app.modules.booktwo.`data`.model.BooktwoModel
import org.koin.core.KoinComponent

class BooktwoVM : ViewModel(), KoinComponent {
  val booktwoModel: MutableLiveData<BooktwoModel> = MutableLiveData(BooktwoModel())

  var navArguments: Bundle? = null
}
