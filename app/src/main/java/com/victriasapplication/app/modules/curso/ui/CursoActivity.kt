package com.victriasapplication.app.modules.curso.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.base.BaseActivity
import com.victriasapplication.app.databinding.ActivityCursoBinding
import com.victriasapplication.app.modules.curso.`data`.model.CursoRowModel
import com.victriasapplication.app.modules.curso.`data`.viewmodel.CursoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CursoActivity : BaseActivity<ActivityCursoBinding>(R.layout.activity_curso) {
  private val viewModel: CursoVM by viewModels<CursoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val cursoAdapter = CursoAdapter(viewModel.cursoList.value?:mutableListOf())
    binding.recyclerCurso.adapter = cursoAdapter
    cursoAdapter.setOnItemClickListener(
    object : CursoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CursoRowModel) {
        onClickRecyclerCurso(view, position, item)
      }
    }
    )
    viewModel.cursoList.observe(this) {
      cursoAdapter.updateData(it)
    }
    binding.cursoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerCurso(
    view: View,
    position: Int,
    item: CursoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CURSO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CursoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
