package com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerview.nestedadapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewwithdifferentitemlayouts.databinding.ActorItemLayoutBinding
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerview.model.Actor

class ActorItemAdapter(
    private val actorList: ArrayList<Actor>
) : RecyclerView.Adapter<ActorItemAdapter.ActorViewHolder>() {
    class ActorViewHolder(itemView: ActorItemLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        private val actorName = itemView.tvActorName
        private val actorImage = itemView.ivMasterActor
        fun bind(actor: Actor) {
            actorName.text = actor.name
            Glide.with(itemView.context)
                .load(actor.image)
                .into(actorImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val view =
            ActorItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ActorViewHolder(view)
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        holder.bind(actorList[position])
    }

    override fun getItemCount(): Int {
        return actorList.size
    }
}