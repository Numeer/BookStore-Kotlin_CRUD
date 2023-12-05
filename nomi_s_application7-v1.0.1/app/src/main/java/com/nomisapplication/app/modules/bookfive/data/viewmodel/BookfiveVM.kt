package com.nomisapplication.app.modules.bookfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nomisapplication.app.modules.bookfive.`data`.model.BookfiveModel
import org.koin.core.KoinComponent

class BookfiveVM : ViewModel(), KoinComponent {
  val bookfiveModel: MutableLiveData<BookfiveModel> = MutableLiveData(BookfiveModel())

  var navArguments: Bundle? = null
}
