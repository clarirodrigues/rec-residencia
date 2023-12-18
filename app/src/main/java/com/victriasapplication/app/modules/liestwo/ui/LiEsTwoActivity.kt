package com.victriasapplication.app.modules.liestwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.base.BaseActivity
import com.victriasapplication.app.databinding.ActivityLiEsTwoBinding
import com.victriasapplication.app.modules.liestwo.`data`.viewmodel.LiEsTwoVM
import kotlin.String
import kotlin.Unit

class LiEsTwoActivity : BaseActivity<ActivityLiEsTwoBinding>(R.layout.activity_li_es_two) {
  private val viewModel: LiEsTwoVM by viewModels<LiEsTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liEsTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LI_ES_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LiEsTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
