package com.victriasapplication.app.modules.categoria.`data`.model

import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CategoriaRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPraSempre: String? = MyApp.getInstance().resources.getString(R.string.lbl_pra_sempre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFernandinho: String? = MyApp.getInstance().resources.getString(R.string.lbl_fernandinho)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGospelReligiosOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gospel_religios)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDificuldade: String? = MyApp.getInstance().resources.getString(R.string.lbl_dificuldade)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFcil: String? = MyApp.getInstance().resources.getString(R.string.lbl_f_cil)

)
