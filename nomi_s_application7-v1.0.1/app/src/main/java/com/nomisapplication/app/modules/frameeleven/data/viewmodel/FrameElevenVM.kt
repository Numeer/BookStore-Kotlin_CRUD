package com.nomisapplication.app.modules.frameeleven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nomisapplication.app.modules.frameeleven.`data`.model.FrameElevenModel
import org.koin.core.KoinComponent

class FrameElevenVM : ViewModel(), KoinComponent {
  val frameElevenModel: MutableLiveData<FrameElevenModel> = MutableLiveData(FrameElevenModel())

  var navArguments: Bundle? = null
}
