package com.victriasapplication.app.modules.msicaacordes.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.victriasapplication.app.R
import com.victriasapplication.app.databinding.RowStaggeredeBinding
import com.victriasapplication.app.modules.msicaacordes.`data`.model.StaggeredeRowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredeAdapter(
  var list: List<StaggeredeRowModel>
) : RecyclerView.Adapter<StaggeredeAdapter.RowStaggeredeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggeredeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggerede,parent,false)
    return RowStaggeredeVH(view)
  }

  override fun onBindViewHolder(holder: RowStaggeredeVH, position: Int) {
    val staggeredeRowModel = StaggeredeRowModel()
    // TODO uncomment following line after integration with data source
    // val staggeredeRowModel = list[position]
    holder.binding.staggeredeRowModel = staggeredeRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<StaggeredeRowModel>) {
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
      item: StaggeredeRowModel
    ) {
    }
  }

  inner class RowStaggeredeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggeredeBinding = RowStaggeredeBinding.bind(itemView)
  }
}
