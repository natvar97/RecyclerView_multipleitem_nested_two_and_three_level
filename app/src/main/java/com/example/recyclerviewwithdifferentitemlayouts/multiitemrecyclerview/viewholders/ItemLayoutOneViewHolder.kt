package com.example.recyclerviewwithdifferentitemlayouts.multiitemrecyclerview.viewholders

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithdifferentitemlayouts.databinding.ItemLayoutOneBinding

class ItemLayoutOneViewHolder(itemView: ItemLayoutOneBinding) :
    RecyclerView.ViewHolder(itemView.root) {

    val tvUsernameOne: TextView = itemView.tvUsernameOne
    val tvEmailOne: TextView = itemView.tvEmailOne

}