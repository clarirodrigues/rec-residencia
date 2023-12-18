package com.victriasapplication.app.modules.homepage.`data`.model

import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomePageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTheUnforgiven: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_unforgiven)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMetallicaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_metallica)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRockOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_rock)

)
