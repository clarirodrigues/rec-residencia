package com.victriasapplication.app.modules.aulas.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.victriasapplication.app.R
import com.victriasapplication.app.databinding.RowListrectangle181Binding
import com.victriasapplication.app.modules.aulas.`data`.model.Listrectangle181RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle181Adapter(
  var list: List<Listrectangle181RowModel>
) : RecyclerView.Adapter<Listrectangle181Adapter.RowListrectangle181VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle181VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle181,parent,false)
    return RowListrectangle181VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle181VH, position: Int) {
    val listrectangle181RowModel = Listrectangle181RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle181RowModel = list[position]
    holder.binding.listrectangle181RowModel = listrectangle181RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle181RowModel>) {
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
      item: Listrectangle181RowModel
    ) {
    }
  }

  inner class RowListrectangle181VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle181Binding = RowListrectangle181Binding.bind(itemView)
  }
}
