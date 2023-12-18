package com.victriasapplication.app.modules.aulas.`data`.model

import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AulasModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAulas: String? = MyApp.getInstance().resources.getString(R.string.lbl_aulas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinuedeond: String? =
      MyApp.getInstance().resources.getString(R.string.msg_continue_de_ond)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComofuncionau: String? =
      MyApp.getInstance().resources.getString(R.string.msg_como_funciona_u2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAula5Comoaf: String? = MyApp.getInstance().resources.getString(R.string.msg_aula_5_como_af)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForty: String? = MyApp.getInstance().resources.getString(R.string.lbl_40)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCursosrecomend: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cursos_recomend)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameFortyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_iniciante)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTutoriais: String? = MyApp.getInstance().resources.getString(R.string.lbl_tutoriais)

)
