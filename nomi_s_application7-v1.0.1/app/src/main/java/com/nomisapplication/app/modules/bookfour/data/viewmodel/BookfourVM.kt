package com.nomisapplication.app.modules.bookfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nomisapplication.app.modules.bookfour.`data`.model.BookfourModel
import org.koin.core.KoinComponent

class BookfourVM : ViewModel(), KoinComponent {
  val bookfourModel: MutableLiveData<BookfourModel> = MutableLiveData(BookfourModel())

  var navArguments: Bundle? = null
}
