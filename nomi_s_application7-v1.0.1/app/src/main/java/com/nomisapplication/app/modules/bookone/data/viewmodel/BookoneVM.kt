package com.nomisapplication.app.modules.bookone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nomisapplication.app.modules.bookone.`data`.model.BookoneModel
import org.koin.core.KoinComponent

class BookoneVM : ViewModel(), KoinComponent {
  val bookoneModel: MutableLiveData<BookoneModel> = MutableLiveData(BookoneModel())

  var navArguments: Bundle? = null

}
