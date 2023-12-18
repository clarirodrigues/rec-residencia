package com.victriasapplication.app.modules.perfil.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.victriasapplication.app.R
import com.victriasapplication.app.databinding.RowPerfilBinding
import com.victriasapplication.app.modules.perfil.`data`.model.PerfilRowModel
import kotlin.Int
import kotlin.collections.List

class PerfilAdapter(
  var list: List<PerfilRowModel>
) : RecyclerView.Adapter<PerfilAdapter.RowPerfilVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPerfilVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_perfil,parent,false)
    return RowPerfilVH(view)
  }

  override fun onBindViewHolder(holder: RowPerfilVH, position: Int) {
    val perfilRowModel = PerfilRowModel()
    // TODO uncomment following line after integration with data source
    // val perfilRowModel = list[position]
    holder.binding.perfilRowModel = perfilRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PerfilRowModel>) {
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
      item: PerfilRowModel
    ) {
    }
  }

  inner class RowPerfilVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPerfilBinding = RowPerfilBinding.bind(itemView)
  }
}
