package com.victriasapplication.app.modules.aulas.`data`.model

import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListdedilhadosfceRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDedilhadosFce: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dedilhados_f_ce)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInicianteTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_iniciante)

)
