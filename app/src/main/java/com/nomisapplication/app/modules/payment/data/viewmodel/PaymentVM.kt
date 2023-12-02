package com.nomisapplication.app.modules.payment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nomisapplication.app.modules.payment.`data`.model.PaymentModel
import org.koin.core.KoinComponent

class PaymentVM : ViewModel(), KoinComponent {
  val paymentModel: MutableLiveData<PaymentModel> = MutableLiveData(PaymentModel())

  var navArguments: Bundle? = null
}
