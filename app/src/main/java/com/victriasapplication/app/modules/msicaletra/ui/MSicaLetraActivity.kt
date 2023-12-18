package com.victriasapplication.app.modules.msicaletra.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.base.BaseActivity
import com.victriasapplication.app.databinding.ActivityMSicaLetraBinding
import com.victriasapplication.app.modules.msicaacordes.ui.MSicaAcordesActivity
import com.victriasapplication.app.modules.msicaletra.`data`.viewmodel.MSicaLetraVM
import kotlin.String
import kotlin.Unit

class MSicaLetraActivity : BaseActivity<ActivityMSicaLetraBinding>(R.layout.activity_m_sica_letra) {
  private val viewModel: MSicaLetraVM by viewModels<MSicaLetraVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mSicaLetraVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtAcordes.setOnClickListener {
      val destIntent = MSicaAcordesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "M_SICA_LETRA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MSicaLetraActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
