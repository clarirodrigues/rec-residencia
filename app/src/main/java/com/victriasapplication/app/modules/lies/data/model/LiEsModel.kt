package com.victriasapplication.app.modules.lies.`data`.model

import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LiEsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLies: String? = MyApp.getInstance().resources.getString(R.string.lbl_li_es)

)
