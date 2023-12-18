package com.victriasapplication.app.modules.categoria.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.victriasapplication.app.R
import com.victriasapplication.app.databinding.RowCategoriaBinding
import com.victriasapplication.app.modules.categoria.`data`.model.CategoriaRowModel
import kotlin.Int
import kotlin.collections.List

class CategoriaAdapter(
  var list: List<CategoriaRowModel>
) : RecyclerView.Adapter<CategoriaAdapter.RowCategoriaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCategoriaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_categoria,parent,false)
    return RowCategoriaVH(view)
  }

  override fun onBindViewHolder(holder: RowCategoriaVH, position: Int) {
    val categoriaRowModel = CategoriaRowModel()
    // TODO uncomment following line after integration with data source
    // val categoriaRowModel = list[position]
    holder.binding.categoriaRowModel = categoriaRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CategoriaRowModel>) {
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
      item: CategoriaRowModel
    ) {
    }
  }

  inner class RowCategoriaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCategoriaBinding = RowCategoriaBinding.bind(itemView)
    init {
      binding.linearRowrectanglethirtysix.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, CategoriaRowModel())
      }
    }
  }
}
