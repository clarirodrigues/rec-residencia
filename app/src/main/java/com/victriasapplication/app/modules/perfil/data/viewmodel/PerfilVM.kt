package com.victriasapplication.app.modules.perfil.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.victriasapplication.app.modules.perfil.`data`.model.PerfilModel
import com.victriasapplication.app.modules.perfil.`data`.model.PerfilRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PerfilVM : ViewModel(), KoinComponent {
  val perfilModel: MutableLiveData<PerfilModel> = MutableLiveData(PerfilModel())

  var navArguments: Bundle? = null

  val perfilList: MutableLiveData<MutableList<PerfilRowModel>> = MutableLiveData(mutableListOf())
}
