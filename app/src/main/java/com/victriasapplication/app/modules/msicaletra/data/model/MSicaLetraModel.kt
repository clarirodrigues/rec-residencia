package com.victriasapplication.app.modules.msicaletra.`data`.model

import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MSicaLetraModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVamosaprender: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_vamos_aprender)
  ,
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
  var txtGospelReligios: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gospel_religios)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTom: String? = MyApp.getInstance().resources.getString(R.string.lbl_tom)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtC: String? = MyApp.getInstance().resources.getString(R.string.lbl_c)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNAcordes: String? = MyApp.getInstance().resources.getString(R.string.lbl_n_acordes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_05)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAcordes: String? = MyApp.getInstance().resources.getString(R.string.lbl_acordes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetra: String? = MyApp.getInstance().resources.getString(R.string.lbl_letra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDecrement: String? = MyApp.getInstance().resources.getString(R.string.lbl_v_deo_aula)

)
