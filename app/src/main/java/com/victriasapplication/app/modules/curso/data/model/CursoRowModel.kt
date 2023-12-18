package com.victriasapplication.app.modules.curso.`data`.model

import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CursoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAula1Comoaf: String? = MyApp.getInstance().resources.getString(R.string.msg_aula_1_como_af)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_05_32)

)
