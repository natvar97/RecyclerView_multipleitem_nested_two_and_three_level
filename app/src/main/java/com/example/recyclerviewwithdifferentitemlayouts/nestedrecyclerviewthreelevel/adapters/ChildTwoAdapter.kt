package com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerviewthreelevel.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithdifferentitemlayouts.databinding.ItemChildTwoBinding
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerviewthreelevel.model.ChildTwo

class ChildTwoAdapter(
    private val list : ArrayList<ChildTwo>
) : RecyclerView.Adapter<ChildTwoAdapter.ChildTwoViewHolder>() {
    class ChildTwoViewHolder(itemView: ItemChildTwoBinding) : RecyclerView.ViewHolder(itemView.root){
        private val tvChildTwo = itemView.tvChildTwo
        fun bind(text : ChildTwo) {
            tvChildTwo.text = text.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildTwoViewHolder {
        val view = ItemChildTwoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChildTwoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChildTwoViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}