package com.victriasapplication.app.modules.lies.`data`.model

import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LiEsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_pr_ximo_n_vel_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPontosCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_908_pontos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.msg_pratique_e_suba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_voc_est_indo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_908)

)
