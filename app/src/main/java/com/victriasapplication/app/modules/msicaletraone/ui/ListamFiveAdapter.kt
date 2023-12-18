package com.victriasapplication.app.modules.msicaletraone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.victriasapplication.app.R
import com.victriasapplication.app.databinding.RowListamFiveBinding
import com.victriasapplication.app.modules.msicaletraone.`data`.model.ListamFiveRowModel
import kotlin.Int
import kotlin.collections.List

class ListamFiveAdapter(
  var list: List<ListamFiveRowModel>
) : RecyclerView.Adapter<ListamFiveAdapter.RowListamFiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListamFiveVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listam_five,parent,false)
    return RowListamFiveVH(view)
  }

  override fun onBindViewHolder(holder: RowListamFiveVH, position: Int) {
    val listamFiveRowModel = ListamFiveRowModel()
    // TODO uncomment following line after integration with data source
    // val listamFiveRowModel = list[position]
    holder.binding.listamFiveRowModel = listamFiveRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListamFiveRowModel>) {
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
      item: ListamFiveRowModel
    ) {
    }
  }

  inner class RowListamFiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListamFiveBinding = RowListamFiveBinding.bind(itemView)
  }
}
