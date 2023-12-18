package com.victriasapplication.app.modules.homepage.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.base.BaseFragment
import com.victriasapplication.app.databinding.FragmentHomePageBinding
import com.victriasapplication.app.modules.homepage.`data`.model.HomePage1RowModel
import com.victriasapplication.app.modules.homepage.`data`.model.HomePageRowModel
import com.victriasapplication.app.modules.homepage.`data`.viewmodel.HomePageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomePageFragment : BaseFragment<FragmentHomePageBinding>(R.layout.fragment_home_page) {
  private val viewModel: HomePageVM by viewModels<HomePageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val homePageAdapter = HomePageAdapter(viewModel.homePageList.value?:mutableListOf())
    binding.recyclerHomePage.adapter = homePageAdapter
    homePageAdapter.setOnItemClickListener(
    object : HomePageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomePageRowModel) {
        onClickRecyclerHomePage(view, position, item)
      }
    }
    )
    viewModel.homePageList.observe(requireActivity()) {
      homePageAdapter.updateData(it)
    }
    val homePage1Adapter = HomePage1Adapter(viewModel.homePage1List.value?:mutableListOf())
    binding.recyclerHomePage1.adapter = homePage1Adapter
    homePage1Adapter.setOnItemClickListener(
    object : HomePage1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomePage1RowModel) {
        onClickRecyclerHomePage1(view, position, item)
      }
    }
    )
    viewModel.homePage1List.observe(requireActivity()) {
      homePage1Adapter.updateData(it)
    }
    binding.homePageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerHomePage(
    view: View,
    position: Int,
    item: HomePageRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerHomePage1(
    view: View,
    position: Int,
    item: HomePage1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_PAGE_FRAGMENT"


    fun getInstance(bundle: Bundle?): HomePageFragment {
      val fragment = HomePageFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
