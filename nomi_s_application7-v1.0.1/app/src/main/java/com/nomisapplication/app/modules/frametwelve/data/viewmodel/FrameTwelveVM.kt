package com.nomisapplication.app.modules.frametwelve.data.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nomisapplication.app.modules.bookone.data.model.BookoneModel
import com.nomisapplication.app.modules.frametwelve.data.model.FrameTwelveModel
import org.koin.core.KoinComponent

class FrameTwelveVM : ViewModel(), KoinComponent {
  val bookoneModel: MutableLiveData<BookoneModel?> = MutableLiveData(BookoneModel())
  val frameTwelveModel: MutableLiveData<FrameTwelveModel> = MutableLiveData(FrameTwelveModel())
  var navArguments: Bundle? = null
}
