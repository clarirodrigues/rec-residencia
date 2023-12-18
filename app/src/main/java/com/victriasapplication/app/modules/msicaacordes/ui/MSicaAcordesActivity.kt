package com.victriasapplication.app.modules.msicaacordes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.base.BaseActivity
import com.victriasapplication.app.databinding.ActivityMSicaAcordesBinding
import com.victriasapplication.app.modules.msicaacordes.`data`.model.StaggeredeRowModel
import com.victriasapplication.app.modules.msicaacordes.`data`.viewmodel.MSicaAcordesVM
import com.victriasapplication.app.modules.msicaletraone.ui.MSicaLetraOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MSicaAcordesActivity :
    BaseActivity<ActivityMSicaAcordesBinding>(R.layout.activity_m_sica_acordes) {
  private val viewModel: MSicaAcordesVM by viewModels<MSicaAcordesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredeAdapter = StaggeredeAdapter(viewModel.staggeredeList.value?:mutableListOf())
    binding.recyclerStaggerede.adapter = staggeredeAdapter
    staggeredeAdapter.setOnItemClickListener(
    object : StaggeredeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : StaggeredeRowModel) {
        onClickRecyclerStaggerede(view, position, item)
      }
    }
    )
    viewModel.staggeredeList.observe(this) {
      staggeredeAdapter.updateData(it)
    }
    binding.mSicaAcordesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAvanar.setOnClickListener {
      val destIntent = MSicaLetraOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtLetra.setOnClickListener {
      val destIntent = MSicaLetraOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggerede(
    view: View,
    position: Int,
    item: StaggeredeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "M_SICA_ACORDES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MSicaAcordesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
