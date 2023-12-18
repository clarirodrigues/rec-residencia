package com.victriasapplication.app.modules.lies.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.victriasapplication.app.R
import com.victriasapplication.app.databinding.RowLiEsBinding
import com.victriasapplication.app.modules.lies.`data`.model.LiEsRowModel
import kotlin.Int
import kotlin.collections.List

class LiesAdapter(
  var list: List<LiEsRowModel>
) : RecyclerView.Adapter<LiesAdapter.RowLiEsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLiEsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_li_es,parent,false)
    return RowLiEsVH(view)
  }

  override fun onBindViewHolder(holder: RowLiEsVH, position: Int) {
    val liEsRowModel = LiEsRowModel()
    // TODO uncomment following line after integration with data source
    // val liEsRowModel = list[position]
    holder.binding.liEsRowModel = liEsRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LiEsRowModel>) {
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
      item: LiEsRowModel
    ) {
    }
  }

  inner class RowLiEsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLiEsBinding = RowLiEsBinding.bind(itemView)
    init {
      binding.frameCard.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, LiEsRowModel())
      }
    }
  }
}
