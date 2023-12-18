package com.victriasapplication.app.modules.perfil.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.base.BaseActivity
import com.victriasapplication.app.databinding.ActivityPerfilBinding
import com.victriasapplication.app.modules.perfil.`data`.model.PerfilRowModel
import com.victriasapplication.app.modules.perfil.`data`.viewmodel.PerfilVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PerfilActivity : BaseActivity<ActivityPerfilBinding>(R.layout.activity_perfil) {
  private val viewModel: PerfilVM by viewModels<PerfilVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val perfilAdapter = PerfilAdapter(viewModel.perfilList.value?:mutableListOf())
    binding.recyclerPerfil.adapter = perfilAdapter
    perfilAdapter.setOnItemClickListener(
    object : PerfilAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PerfilRowModel) {
        onClickRecyclerPerfil(view, position, item)
      }
    }
    )
    viewModel.perfilList.observe(this) {
      perfilAdapter.updateData(it)
    }
    binding.perfilVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerPerfil(
    view: View,
    position: Int,
    item: PerfilRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PERFIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PerfilActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
