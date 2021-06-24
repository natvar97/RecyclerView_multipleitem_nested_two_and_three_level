package com.example.recyclerviewwithdifferentitemlayouts.multiitemrecyclerview.viewholders

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.res.Resources
import android.content.res.loader.ResourcesProvider
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewwithdifferentitemlayouts.R
import com.example.recyclerviewwithdifferentitemlayouts.databinding.ActivityMainBinding
import com.example.recyclerviewwithdifferentitemlayouts.model.User
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerview.model.Actor
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerview.model.Movie


class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var rvAdapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        rvAdapter = RecyclerViewAdapter(getSampleArrayList())

        mBinding.rvMain.layoutManager = LinearLayoutManager(this)
        mBinding.rvMain.adapter = rvAdapter

    }

    private fun getSampleArrayList(): ArrayList<Any> {
        val items: ArrayList<Any> = ArrayList()
        items.add(User("Dany Targaryen", "Valyria"))
        items.add(User("Rob Stark", "Winterfell"))
        items.add("image")
        items.add(
            Movie(
                resources.getString(R.string.movie_master),
                resources.getString(R.string.master_imdb),
                resources.getString(R.string.master_director),
                R.drawable.master_poster,
                getActorList()
            )
        )
        items.add(User("Jon Snow", "Castle Black"))
        items.add("image")
        items.add(User("Tyrion Lanister", "King's Landing"))
        items.add(
            Movie(
                resources.getString(R.string.movie_master),
                resources.getString(R.string.master_imdb),
                resources.getString(R.string.master_director),
                R.drawable.master_poster,
                getActorList()
            )
        )
        items.add(User("Sercy Lanister", "King's Landing"))
        items.add("image")
        items.add(User("The Bad Guy", "King's Landing"))
        items.add(
            Movie(
                resources.getString(R.string.movie_master),
                resources.getString(R.string.master_imdb),
                resources.getString(R.string.master_director),
                R.drawable.master_poster,
                getActorList()
            )
        )
        items.add("image")
        items.add(User("Jack Sparrow", "The Pirate"))
        return items
    }

    private fun getMoviesList(): ArrayList<Movie> {

        val list = ArrayList<Movie>()
//    list.add(
//        Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(
//            R.string.master_director), R.drawable.master_poster, getActorList())
//    )
//    list.add(
//        Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(
//            R.string.master_director), R.drawable.master_poster, getActorList())
//    )
//    list.add(
//        Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(
//            R.string.master_director), R.drawable.master_poster, getActorList())
//    )
//    list.add(
//        Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(
//            R.string.master_director), R.drawable.master_poster, getActorList())
//    )
//    list.add(
//        Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(
//            R.string.master_director), R.drawable.master_poster, getActorList())
//    )
//    list.add(
//        Movie(resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb), resources.getString(
//            R.string.master_director), R.drawable.master_poster, getActorList())
//    )
        list.add(
            Movie(
                resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb),
                resources.getString(R.string.master_director), R.drawable.master_poster, getActorList()
            )
        )
        list.add(
            Movie(
                resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb),
                resources.getString(R.string.master_director), R.drawable.master_poster, getActorList()
            )
        )
        list.add(
            Movie(
                resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb),
                resources.getString(R.string.master_director), R.drawable.master_poster, getActorList()
            )
        )
        list.add(
            Movie(
                resources.getString(R.string.movie_master), resources.getString(R.string.master_imdb),
                resources.getString(R.string.master_director), R.drawable.master_poster, getActorList()
            )
        )

        return list
    }

    private fun getActorList(): ArrayList<Actor> {
        val actorList = ArrayList<Actor>()
        actorList.add(
            Actor(
                resources.getString(R.string.master_actor1),
                R.drawable.master_vijay
            )
        )
        actorList.add(
            Actor(
                resources.getString(R.string.master_actor2),
                R.drawable.master_malavika
            )
        )
        actorList.add(
            Actor(
                resources.getString(R.string.master_actor3),
                R.drawable.master_vijay_sethupati
            )
        )
        actorList.add(
            Actor(
                resources.getString(R.string.master_actor4),
                R.drawable.master_arjun_das
            )
        )
        actorList.add(
            Actor(
                resources.getString(R.string.master_actor5),
                R.drawable.master_andrea
            )
        )
        return actorList
    }
}