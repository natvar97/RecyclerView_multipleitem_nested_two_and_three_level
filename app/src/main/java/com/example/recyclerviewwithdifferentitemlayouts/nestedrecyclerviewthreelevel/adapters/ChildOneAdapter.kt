package com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerviewthreelevel.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithdifferentitemlayouts.databinding.ItemChildOneBinding
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerviewthreelevel.model.ChildOne
class ChildOneAdapter(
    private val list: ArrayList<ChildOne>
) : RecyclerView.Adapter<ChildOneAdapter.ChildOneViewHolder>() {
    class ChildOneViewHolder(itemView: ItemChildOneBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        private val tvParent = itemView.tvChildOne
        private val rvChildOne = itemView.rvChildOne

        fun bind(childOne: ChildOne) {
            tvParent.text = childOne.title
            val layoutManager = LinearLayoutManager(itemView.context)
            layoutManager.orientation = LinearLayoutManager.HORIZONTAL
            rvChildOne.layoutManager = layoutManager
            rvChildOne.isNestedScrollingEnabled = true
            rvChildOne.adapter = ChildTwoAdapter(childOne.childTwoList)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildOneViewHolder {
        val view = ItemChildOneBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChildOneViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChildOneViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}