package com.victriasapplication.app.modules.homepage.`data`.model

import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomePage1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBobMarleyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_bob_marley)

)
