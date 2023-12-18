package com.victriasapplication.app.modules.curso.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.victriasapplication.app.R
import com.victriasapplication.app.databinding.RowCursoBinding
import com.victriasapplication.app.modules.curso.`data`.model.CursoRowModel
import kotlin.Int
import kotlin.collections.List

class CursoAdapter(
  var list: List<CursoRowModel>
) : RecyclerView.Adapter<CursoAdapter.RowCursoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCursoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_curso,parent,false)
    return RowCursoVH(view)
  }

  override fun onBindViewHolder(holder: RowCursoVH, position: Int) {
    val cursoRowModel = CursoRowModel()
    // TODO uncomment following line after integration with data source
    // val cursoRowModel = list[position]
    holder.binding.cursoRowModel = cursoRowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CursoRowModel>) {
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
      item: CursoRowModel
    ) {
    }
  }

  inner class RowCursoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCursoBinding = RowCursoBinding.bind(itemView)
  }
}
