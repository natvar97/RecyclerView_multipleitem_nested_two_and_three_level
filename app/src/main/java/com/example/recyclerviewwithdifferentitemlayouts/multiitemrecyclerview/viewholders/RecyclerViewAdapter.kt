package com.example.recyclerviewwithdifferentitemlayouts.multiitemrecyclerview.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithdifferentitemlayouts.R
import com.example.recyclerviewwithdifferentitemlayouts.databinding.ItemLayoutOneBinding
import com.example.recyclerviewwithdifferentitemlayouts.databinding.ItemLayoutTwoBinding
import com.example.recyclerviewwithdifferentitemlayouts.databinding.MovieItemLayoutBinding
import com.example.recyclerviewwithdifferentitemlayouts.model.User
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerview.model.Movie
import kotlin.collections.ArrayList

class RecyclerViewAdapter(
    private val listItems: ArrayList<Any>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val USER: Int = 0
    private val IMAGE: Int = 1
    private val MOVIE: Int = 2


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        lateinit var viewHolder: RecyclerView.ViewHolder

        when (viewType) {
            USER -> {
                val view =
                    ItemLayoutOneBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                viewHolder = ItemLayoutOneViewHolder(view)
            }
            IMAGE -> {
                val view =
                    ItemLayoutTwoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                viewHolder = ItemLayoutTwoViewHolder(view)
            }
            MOVIE -> {
                val view = MovieItemLayoutBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                viewHolder = MovieItemViewHolder(view)
            }
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            USER -> {
                val oneVh = holder as ItemLayoutOneViewHolder
                configureItemLayoutOneViewHolder(oneVh, position)
            }
            IMAGE -> {
                val twoVh = holder as ItemLayoutTwoViewHolder
                configureItemLayoutTwoViewHolder(twoVh, position)
            }
            MOVIE -> {
                val movieVh = holder as MovieItemViewHolder
                configureMovieItemViewHolder(movieVh, position)
            }
        }
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    override fun getItemViewType(position: Int): Int {
        if (listItems.get(position) is User) {
            return USER
        } else if (listItems.get(position) is String) {
            return IMAGE
        } else if (listItems.get(position) is Movie) {
            return MOVIE
        }
        return -1;
    }

    private fun configureItemLayoutOneViewHolder(oneVh: ItemLayoutOneViewHolder, position: Int) {
        val user = listItems.get(position) as User
        oneVh.tvUsernameOne.text = user.name
        oneVh.tvEmailOne.text = user.email
    }

    private fun configureItemLayoutTwoViewHolder(twoVh: ItemLayoutTwoViewHolder, position: Int) {
        twoVh.ivImageTwo.setImageResource(R.drawable.icon_google)
    }

    private fun configureMovieItemViewHolder(movieVh: MovieItemViewHolder, position: Int) {
        val movie = listItems.get(position) as Movie
        movieVh.bind(movie)
    }

}