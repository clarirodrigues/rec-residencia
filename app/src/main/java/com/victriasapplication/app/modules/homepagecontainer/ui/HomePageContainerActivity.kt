package com.victriasapplication.app.modules.homepagecontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.base.BaseActivity
import com.victriasapplication.app.databinding.ActivityHomePageContainerBinding
import com.victriasapplication.app.extensions.loadFragment
import com.victriasapplication.app.modules.afinador.ui.AfinadorFragment
import com.victriasapplication.app.modules.aulas.ui.AulasFragment
import com.victriasapplication.app.modules.homepage.ui.HomePageFragment
import com.victriasapplication.app.modules.homepagecontainer.`data`.viewmodel.HomePageContainerVM
import com.victriasapplication.app.modules.lies.ui.LiEsFragment
import kotlin.String
import kotlin.Unit

class HomePageContainerActivity :
    BaseActivity<ActivityHomePageContainerBinding>(R.layout.activity_home_page_container) {
  private val viewModel: HomePageContainerVM by viewModels<HomePageContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homePageContainerVM = viewModel
    val destFragment = HomePageFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = HomePageFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearSolarhome2bo3.setOnClickListener {
      val destFragment = AfinadorFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = AfinadorFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearSolarhome2bo2.setOnClickListener {
      val destFragment = AulasFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = AulasFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearSolarhome2bo1.setOnClickListener {
      val destFragment = LiEsFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = LiEsFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearSolarhome2bo.setOnClickListener {
      val destFragment = HomePageFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = HomePageFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "HOME_PAGE_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomePageContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
