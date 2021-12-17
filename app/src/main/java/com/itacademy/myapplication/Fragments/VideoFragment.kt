package com.itacademy.myapplication.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.itacademy.myapplication.Categories
import com.itacademy.myapplication.Constants
import com.itacademy.myapplication.R

class VideoFragment : Fragment(){


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_video, container, false)
        var filteredArray = Constants.categories.filter { item ->
            item.id == Categories.Horror.ordinal || item.id == Categories.Comedy.ordinal || item.id == Categories.Cartoon.ordinal}

        return view
    }
}