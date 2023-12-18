package com.victriasapplication.app.modules.aulas.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.victriasapplication.app.modules.aulas.`data`.model.AulasModel
import com.victriasapplication.app.modules.aulas.`data`.model.ListdedilhadosfceRowModel
import com.victriasapplication.app.modules.aulas.`data`.model.Listrectangle181RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AulasVM : ViewModel(), KoinComponent {
  val aulasModel: MutableLiveData<AulasModel> = MutableLiveData(AulasModel())

  var navArguments: Bundle? = null

  val listrectangle181List: MutableLiveData<MutableList<Listrectangle181RowModel>> =
      MutableLiveData(mutableListOf())

  val listdedilhadosfceList: MutableLiveData<MutableList<ListdedilhadosfceRowModel>> =
      MutableLiveData(mutableListOf())
}
