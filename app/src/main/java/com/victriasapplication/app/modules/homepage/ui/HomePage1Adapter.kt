package com.victriasapplication.app.modules.homepage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.victriasapplication.app.R
import com.victriasapplication.app.databinding.RowHomePage1Binding
import com.victriasapplication.app.modules.homepage.`data`.model.HomePage1RowModel
import kotlin.Int
import kotlin.collections.List

class HomePage1Adapter(
  var list: List<HomePage1RowModel>
) : RecyclerView.Adapter<HomePage1Adapter.RowHomePage1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomePage1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_page1,parent,false)
    return RowHomePage1VH(view)
  }

  override fun onBindViewHolder(holder: RowHomePage1VH, position: Int) {
    val homePage1RowModel = HomePage1RowModel()
    // TODO uncomment following line after integration with data source
    // val homePage1RowModel = list[position]
    holder.binding.homePage1RowModel = homePage1RowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomePage1RowModel>) {
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
      item: HomePage1RowModel
    ) {
    }
  }

  inner class RowHomePage1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHomePage1Binding = RowHomePage1Binding.bind(itemView)
  }
}
