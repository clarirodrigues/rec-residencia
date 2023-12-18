package com.victriasapplication.app.modules.categoria.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.victriasapplication.app.modules.categoria.`data`.model.CategoriaModel
import com.victriasapplication.app.modules.categoria.`data`.model.CategoriaRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CategoriaVM : ViewModel(), KoinComponent {
  val categoriaModel: MutableLiveData<CategoriaModel> = MutableLiveData(CategoriaModel())

  var navArguments: Bundle? = null

  val categoriaList: MutableLiveData<MutableList<CategoriaRowModel>> =
      MutableLiveData(mutableListOf())
}
