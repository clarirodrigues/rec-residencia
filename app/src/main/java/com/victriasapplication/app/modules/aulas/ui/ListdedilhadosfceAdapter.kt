package com.victriasapplication.app.modules.aulas.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.victriasapplication.app.R
import com.victriasapplication.app.databinding.RowListdedilhadosfceBinding
import com.victriasapplication.app.modules.aulas.`data`.model.ListdedilhadosfceRowModel
import kotlin.Int
import kotlin.collections.List

class ListdedilhadosfceAdapter(
  var list: List<ListdedilhadosfceRowModel>
) : RecyclerView.Adapter<ListdedilhadosfceAdapter.RowListdedilhadosfceVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListdedilhadosfceVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listdedilhadosfce,parent,false)
    return RowListdedilhadosfceVH(view)
  }

  override fun onBindViewHolder(holder: RowListdedilhadosfceVH, position: Int) {
    val listdedilhadosfceRowModel = ListdedilhadosfceRowModel()
    // TODO uncomment following line after integration with data source
    // val listdedilhadosfceRowModel = list[position]
    holder.binding.listdedilhadosfceRowModel = listdedilhadosfceRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListdedilhadosfceRowModel>) {
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
      item: ListdedilhadosfceRowModel
    ) {
    }
  }

  inner class RowListdedilhadosfceVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListdedilhadosfceBinding = RowListdedilhadosfceBinding.bind(itemView)
  }
}
