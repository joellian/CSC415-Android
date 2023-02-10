package com.example.csc415_android.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.csc415_android.R


class Player_Detail_Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_player__detail_, container, false)
        if(arguments != null){
            val name = requireArguments().getString("name")
            val age = requireArguments().getString("age")
           // view.findViewById<>(R.id.player_name).text = name
        }
        return view
    }


}