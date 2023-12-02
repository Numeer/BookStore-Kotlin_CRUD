package com.nomisapplication.app.modules.bookthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nomisapplication.app.modules.bookthree.`data`.model.BookthreeModel
import org.koin.core.KoinComponent

class BookthreeVM : ViewModel(), KoinComponent {
  val bookthreeModel: MutableLiveData<BookthreeModel> = MutableLiveData(BookthreeModel())

  var navArguments: Bundle? = null
}
