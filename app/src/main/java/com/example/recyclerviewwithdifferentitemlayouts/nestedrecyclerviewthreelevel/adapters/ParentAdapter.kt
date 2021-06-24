package com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerviewthreelevel.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithdifferentitemlayouts.databinding.ItemParentBinding
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerviewthreelevel.model.Parent

class ParentAdapter(
    private val list : ArrayList<Parent>
) : RecyclerView.Adapter<ParentAdapter.ParentViewHolder>() {
    class ParentViewHolder(itemView : ItemParentBinding) : RecyclerView.ViewHolder(itemView.root) {
        private val tvParent = itemView.tvParent
        private val rvParent = itemView.rvParent

        fun bind(parent : Parent) {
            tvParent.text = parent.title
            val layoutManager = LinearLayoutManager(itemView.context)
            layoutManager.orientation = LinearLayoutManager.HORIZONTAL
            rvParent.layoutManager = layoutManager
            rvParent.isNestedScrollingEnabled = true
            rvParent.adapter = ChildOneAdapter(parent.childOneList)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
        val view = ItemParentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ParentViewHolder(view)
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}