package com.victriasapplication.app.modules.lies.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.victriasapplication.app.modules.lies.`data`.model.LiEsModel
import com.victriasapplication.app.modules.lies.`data`.model.LiEsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LiEsVM : ViewModel(), KoinComponent {
  val liEsModel: MutableLiveData<LiEsModel> = MutableLiveData(LiEsModel())

  var navArguments: Bundle? = null

  val liesList: MutableLiveData<MutableList<LiEsRowModel>> = MutableLiveData(mutableListOf())
}
