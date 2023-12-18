package com.victriasapplication.app.modules.curso.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.victriasapplication.app.modules.curso.`data`.model.CursoModel
import com.victriasapplication.app.modules.curso.`data`.model.CursoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CursoVM : ViewModel(), KoinComponent {
  val cursoModel: MutableLiveData<CursoModel> = MutableLiveData(CursoModel())

  var navArguments: Bundle? = null

  val cursoList: MutableLiveData<MutableList<CursoRowModel>> = MutableLiveData(mutableListOf())
}
