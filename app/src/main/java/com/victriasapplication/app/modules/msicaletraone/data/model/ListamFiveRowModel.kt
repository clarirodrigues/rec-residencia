package com.victriasapplication.app.modules.msicaletraone.`data`.model

import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListamFiveRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAmFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_am)

)
