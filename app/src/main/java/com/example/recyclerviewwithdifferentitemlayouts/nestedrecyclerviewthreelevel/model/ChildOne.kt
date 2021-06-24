package com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerviewthreelevel.model

data class ChildOne(
    var title : String,
    var childTwoList : ArrayList<ChildTwo>
)
