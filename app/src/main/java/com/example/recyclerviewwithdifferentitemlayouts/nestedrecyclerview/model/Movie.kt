package com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerview.model

data class Movie(
    var title: String,
    var imdb: String,
    var director: String,
    var poster: Int,
    var cast: ArrayList<Actor>
)
