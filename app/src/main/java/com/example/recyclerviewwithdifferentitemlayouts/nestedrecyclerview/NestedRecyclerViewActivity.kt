package com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewwithdifferentitemlayouts.R
import com.example.recyclerviewwithdifferentitemlayouts.databinding.ActivityNestedRecyclerViewBinding
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerview.model.Actor
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerview.model.Movie
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerview.nestedadapters.MovieItemAdapter

class NestedRecyclerViewActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityNestedRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_nested_recycler_view)

        mBinding = ActivityNestedRecyclerViewBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val movieList = getMoviesList()

        mBinding.rvMain.layoutManager = LinearLayoutManager(this)
        mBinding.rvMain.adapter = MovieItemAdapter(movieList)

    }

    private fun getMoviesList(): ArrayList<Movie> {

        val list = ArrayList<Movie>()
        list.add(Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(R.string.master_director), R.drawable.master_poster, getActorList()))
        list.add(Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(R.string.master_director), R.drawable.master_poster, getActorList()))
        list.add(Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(R.string.master_director), R.drawable.master_poster, getActorList()))
        list.add(Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(R.string.master_director), R.drawable.master_poster, getActorList()))
        list.add(Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(R.string.master_director), R.drawable.master_poster, getActorList()))
        list.add(Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(R.string.master_director), R.drawable.master_poster, getActorList()))
        list.add(Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(R.string.master_director), R.drawable.master_poster, getActorList()))
        list.add(Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(R.string.master_director), R.drawable.master_poster, getActorList()))
        list.add(Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(R.string.master_director), R.drawable.master_poster, getActorList()))
        list.add(Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(R.string.master_director), R.drawable.master_poster, getActorList()))

        return list
    }

    private fun getActorList() : ArrayList<Actor>{
        val actorList = ArrayList<Actor>()
        actorList.add(Actor(resources.getString(R.string.master_actor1), R.drawable.master_vijay))
        actorList.add(Actor(resources.getString(R.string.master_actor2), R.drawable.master_malavika))
        actorList.add(Actor(resources.getString(R.string.master_actor3), R.drawable.master_vijay_sethupati))
        actorList.add(Actor(resources.getString(R.string.master_actor4), R.drawable.master_arjun_das))
        actorList.add(Actor(resources.getString(R.string.master_actor5), R.drawable.master_andrea))
        return actorList
    }
}