package com.victriasapplication.app.modules.perfil.`data`.model

import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PerfilModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJorgeSilva: String? = MyApp.getInstance().resources.getString(R.string.lbl_jorge_silva)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJorgesilvaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_jorge_silva2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNvel: String? = MyApp.getInstance().resources.getString(R.string.lbl_n_vel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameFortyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_iniciante)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVermais: String? = MyApp.getInstance().resources.getString(R.string.lbl_ver_mais)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMsicasfavorit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_m_sicas_favorit)
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
  var txtBlackPumas: String? = MyApp.getInstance().resources.getString(R.string.lbl_black_pumas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItsThisLove: String? = MyApp.getInstance().resources.getString(R.string.lbl_it_s_this_love)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBlackPumasOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_black_pumas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBobMarley: String? = MyApp.getInstance().resources.getString(R.string.lbl_bob_marley)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLies: String? = MyApp.getInstance().resources.getString(R.string.lbl_li_es)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAulas: String? = MyApp.getInstance().resources.getString(R.string.lbl_aulas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAfinador: String? = MyApp.getInstance().resources.getString(R.string.lbl_afinador)

)
