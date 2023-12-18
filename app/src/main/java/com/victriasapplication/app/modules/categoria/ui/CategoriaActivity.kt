package com.victriasapplication.app.modules.categoria.ui

import android.view.View
import androidx.activity.viewModels
import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.base.BaseActivity
import com.victriasapplication.app.databinding.ActivityCategoriaBinding
import com.victriasapplication.app.modules.categoria.`data`.model.CategoriaRowModel
import com.victriasapplication.app.modules.categoria.`data`.viewmodel.CategoriaVM
import com.victriasapplication.app.modules.msicaacordes.ui.MSicaAcordesActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CategoriaActivity : BaseActivity<ActivityCategoriaBinding>(R.layout.activity_categoria) {
  private val viewModel: CategoriaVM by viewModels<CategoriaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val categoriaAdapter = CategoriaAdapter(viewModel.categoriaList.value?:mutableListOf())
    binding.recyclerCategoria.adapter = categoriaAdapter
    categoriaAdapter.setOnItemClickListener(
    object : CategoriaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CategoriaRowModel) {
        onClickRecyclerCategoria(view, position, item)
      }
    }
    )
    viewModel.categoriaList.observe(this) {
      categoriaAdapter.updateData(it)
    }
    binding.categoriaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerCategoria(
    view: View,
    position: Int,
    item: CategoriaRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowrectanglethirtysix ->  {
        val destIntent = MSicaAcordesActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "CATEGORIA_ACTIVITY"

  }
}
