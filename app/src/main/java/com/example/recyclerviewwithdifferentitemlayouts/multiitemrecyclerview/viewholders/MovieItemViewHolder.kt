package com.example.recyclerviewwithdifferentitemlayouts.multiitemrecyclerview.viewholders

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewwithdifferentitemlayouts.databinding.MovieItemLayoutBinding
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerview.model.Movie
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerview.nestedadapters.ActorItemAdapter

class MovieItemViewHolder(itemView: MovieItemLayoutBinding) :
    RecyclerView.ViewHolder(itemView.root) {
    private val movieTitle = itemView.tvMovieTitle
    private val movieIMDb = itemView.tvMovieImdb
    private val movieDirector = itemView.tvMovieDirector
    private val moviePoster = itemView.ivPoster
    private val actorRecyclerView = itemView.rvActor

    fun bind(movie: Movie) {
        movieTitle.text = movie.title
        movieIMDb.text = movie.imdb
        movieDirector.text = movie.director
        Glide.with(itemView.context)
            .load(movie.poster)
            .into(moviePoster)
        val layoutManager = LinearLayoutManager(itemView.context)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        actorRecyclerView.layoutManager = layoutManager
        actorRecyclerView.adapter = ActorItemAdapter(movie.cast)
    }
}
