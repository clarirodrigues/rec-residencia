package com.victriasapplication.app.modules.liestwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.victriasapplication.app.modules.liestwo.`data`.model.LiEsTwoModel
import org.koin.core.KoinComponent

class LiEsTwoVM : ViewModel(), KoinComponent {
  val liEsTwoModel: MutableLiveData<LiEsTwoModel> = MutableLiveData(LiEsTwoModel())

  var navArguments: Bundle? = null
}
