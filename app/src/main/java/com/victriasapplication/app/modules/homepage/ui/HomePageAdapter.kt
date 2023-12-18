package com.victriasapplication.app.modules.homepage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.victriasapplication.app.R
import com.victriasapplication.app.databinding.RowHomePageBinding
import com.victriasapplication.app.modules.homepage.`data`.model.HomePageRowModel
import kotlin.Int
import kotlin.collections.List

class HomePageAdapter(
  var list: List<HomePageRowModel>
) : RecyclerView.Adapter<HomePageAdapter.RowHomePageVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomePageVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_page,parent,false)
    return RowHomePageVH(view)
  }

  override fun onBindViewHolder(holder: RowHomePageVH, position: Int) {
    val homePageRowModel = HomePageRowModel()
    // TODO uncomment following line after integration with data source
    // val homePageRowModel = list[position]
    holder.binding.homePageRowModel = homePageRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomePageRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: HomePageRowModel
    ) {
    }
  }

  inner class RowHomePageVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHomePageBinding = RowHomePageBinding.bind(itemView)
  }
}
