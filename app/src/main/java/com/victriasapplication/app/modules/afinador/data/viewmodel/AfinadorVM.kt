package com.victriasapplication.app.modules.afinador.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.victriasapplication.app.modules.afinador.`data`.model.AfinadorModel
import org.koin.core.KoinComponent

class AfinadorVM : ViewModel(), KoinComponent {
  val afinadorModel: MutableLiveData<AfinadorModel> = MutableLiveData(AfinadorModel())

  var navArguments: Bundle? = null
}
