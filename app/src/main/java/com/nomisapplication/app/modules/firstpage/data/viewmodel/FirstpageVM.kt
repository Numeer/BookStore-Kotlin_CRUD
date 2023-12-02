package com.nomisapplication.app.modules.firstpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nomisapplication.app.modules.firstpage.`data`.model.FirstpageModel
import org.koin.core.KoinComponent

class FirstpageVM : ViewModel(), KoinComponent {
  val firstpageModel: MutableLiveData<FirstpageModel> = MutableLiveData(FirstpageModel())

  var navArguments: Bundle? = null
}
