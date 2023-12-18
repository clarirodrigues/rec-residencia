package com.victriasapplication.app.modules.msicaletraone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.base.BaseActivity
import com.victriasapplication.app.databinding.ActivityMSicaLetraOneBinding
import com.victriasapplication.app.modules.msicaacordes.ui.MSicaAcordesActivity
import com.victriasapplication.app.modules.msicaletra.ui.MSicaLetraActivity
import com.victriasapplication.app.modules.msicaletraone.`data`.model.ListamFiveRowModel
import com.victriasapplication.app.modules.msicaletraone.`data`.viewmodel.MSicaLetraOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MSicaLetraOneActivity :
    BaseActivity<ActivityMSicaLetraOneBinding>(R.layout.activity_m_sica_letra_one) {
  private val viewModel: MSicaLetraOneVM by viewModels<MSicaLetraOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listamFiveAdapter = ListamFiveAdapter(viewModel.listamFiveList.value?:mutableListOf())
    binding.recyclerListamFive.adapter = listamFiveAdapter
    listamFiveAdapter.setOnItemClickListener(
    object : ListamFiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListamFiveRowModel) {
        onClickRecyclerListamFive(view, position, item)
      }
    }
    )
    viewModel.listamFiveList.observe(this) {
      listamFiveAdapter.updateData(it)
    }
    binding.mSicaLetraOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtAcordes.setOnClickListener {
      val destIntent = MSicaAcordesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearStepper1.setOnClickListener {
      val destIntent = MSicaLetraActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListamFive(
    view: View,
    position: Int,
    item: ListamFiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "M_SICA_LETRA_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MSicaLetraOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
