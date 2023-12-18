package com.victriasapplication.app.modules.msicaletraone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.victriasapplication.app.modules.msicaletraone.`data`.model.ListamFiveRowModel
import com.victriasapplication.app.modules.msicaletraone.`data`.model.MSicaLetraOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MSicaLetraOneVM : ViewModel(), KoinComponent {
  val mSicaLetraOneModel: MutableLiveData<MSicaLetraOneModel> =
      MutableLiveData(MSicaLetraOneModel())

  var navArguments: Bundle? = null

  val listamFiveList: MutableLiveData<MutableList<ListamFiveRowModel>> =
      MutableLiveData(mutableListOf())
}
