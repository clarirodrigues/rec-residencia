package com.victriasapplication.app.modules.aulas.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.victriasapplication.app.R
import com.victriasapplication.app.appcomponents.base.BaseFragment
import com.victriasapplication.app.databinding.FragmentAulasBinding
import com.victriasapplication.app.modules.aulas.`data`.model.ListdedilhadosfceRowModel
import com.victriasapplication.app.modules.aulas.`data`.model.Listrectangle181RowModel
import com.victriasapplication.app.modules.aulas.`data`.viewmodel.AulasVM
import com.victriasapplication.app.modules.curso.ui.CursoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AulasFragment : BaseFragment<FragmentAulasBinding>(R.layout.fragment_aulas) {
  private val viewModel: AulasVM by viewModels<AulasVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listrectangle181Adapter =
    Listrectangle181Adapter(viewModel.listrectangle181List.value?:mutableListOf())
    binding.recyclerListrectangle181.adapter = listrectangle181Adapter
    listrectangle181Adapter.setOnItemClickListener(
    object : Listrectangle181Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle181RowModel) {
        onClickRecyclerListrectangle181(view, position, item)
      }
    }
    )
    viewModel.listrectangle181List.observe(requireActivity()) {
      listrectangle181Adapter.updateData(it)
    }
    val listdedilhadosfceAdapter =
    ListdedilhadosfceAdapter(viewModel.listdedilhadosfceList.value?:mutableListOf())
    binding.recyclerListdedilhadosfce.adapter = listdedilhadosfceAdapter
    listdedilhadosfceAdapter.setOnItemClickListener(
    object : ListdedilhadosfceAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListdedilhadosfceRowModel) {
        onClickRecyclerListdedilhadosfce(view, position, item)
      }
    }
    )
    viewModel.listdedilhadosfceList.observe(requireActivity()) {
      listdedilhadosfceAdapter.updateData(it)
    }
    binding.aulasVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle180.setOnClickListener {
      val destIntent = CursoActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerListrectangle181(
    view: View,
    position: Int,
    item: Listrectangle181RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListdedilhadosfce(
    view: View,
    position: Int,
    item: ListdedilhadosfceRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "AULAS_FRAGMENT"


    fun getInstance(bundle: Bundle?): AulasFragment {
      val fragment = AulasFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
