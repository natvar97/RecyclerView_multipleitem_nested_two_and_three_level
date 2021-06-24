package com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerviewthreelevel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewwithdifferentitemlayouts.R
import com.example.recyclerviewwithdifferentitemlayouts.databinding.ActivityNestedRecyclerViewThreeLevelBinding
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerviewthreelevel.adapters.ParentAdapter
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerviewthreelevel.model.ChildOne
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerviewthreelevel.model.ChildTwo
import com.example.recyclerviewwithdifferentitemlayouts.nestedrecyclerviewthreelevel.model.Parent

class NestedRecyclerViewThreeLevel : AppCompatActivity() {

    private lateinit var mBinding: ActivityNestedRecyclerViewThreeLevelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_nested_recycler_view_three_level)

        mBinding = ActivityNestedRecyclerViewThreeLevelBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.rvMain.layoutManager = LinearLayoutManager(this)
        mBinding.rvMain.isNestedScrollingEnabled = true
        mBinding.rvMain.adapter = ParentAdapter(getParentList())

    }

    private fun getParentList(): ArrayList<Parent> {
        val list = ArrayList<Parent>()

        list.add(Parent("One", getChildOneList()))
        list.add(Parent("Two", getChildOneList()))
        list.add(Parent("Three", getChildOneList()))
        list.add(Parent("Four", getChildOneList()))
        list.add(Parent("Five", getChildOneList()))
        list.add(Parent("Six", getChildOneList()))
        list.add(Parent("Seven", getChildOneList()))
        list.add(Parent("Eight", getChildOneList()))
        list.add(Parent("Nine", getChildOneList()))
        list.add(Parent("Ten", getChildOneList()))
        list.add(Parent("Eleven", getChildOneList()))
        list.add(Parent("Twelve", getChildOneList()))
        list.add(Parent("Thirteen", getChildOneList()))
        list.add(Parent("Fourteen", getChildOneList()))
        list.add(Parent("Fifteen", getChildOneList()))

        return list
    }

    private fun getChildOneList(): ArrayList<ChildOne> {
        val list = ArrayList<ChildOne>()

        list.add(ChildOne("One", getChildTwoList()))
        list.add(ChildOne("Two", getChildTwoList()))
        list.add(ChildOne("Three", getChildTwoList()))
        list.add(ChildOne("Four", getChildTwoList()))
        list.add(ChildOne("Five", getChildTwoList()))

        return list
    }

    private fun getChildTwoList(): ArrayList<ChildTwo> {
        val list = ArrayList<ChildTwo>()

        list.add(ChildTwo("One"))
        list.add(ChildTwo("Two"))
        list.add(ChildTwo("Three"))
        list.add(ChildTwo("Four"))
        list.add(ChildTwo("Five"))

        return list
    }

}