package com.victriasapplication.app.modules.msicaacordes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.victriasapplication.app.modules.msicaacordes.`data`.model.MSicaAcordesModel
import com.victriasapplication.app.modules.msicaacordes.`data`.model.StaggeredeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MSicaAcordesVM : ViewModel(), KoinComponent {
  val mSicaAcordesModel: MutableLiveData<MSicaAcordesModel> = MutableLiveData(MSicaAcordesModel())

  var navArguments: Bundle? = null

  val staggeredeList: MutableLiveData<MutableList<StaggeredeRowModel>> =
      MutableLiveData(mutableListOf())
}
