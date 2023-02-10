package com.example.csc415_android.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.csc415_android.Player
import com.example.csc415_android.PlayerAdapter
import com.example.csc415_android.R
import kotlin.random.Random


class Player_List_Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_player_list_fragment, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.player_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val players = mutableListOf<Player>()

        for (i in 0..30) {
            players.add(createPlayer())
        }
        val adapter = PlayerAdapter(players)
        recyclerView.adapter = adapter

        return view

    }

    private fun createPlayer() = Player(
        name = "Name: " + randomPlayerName(),
        image = R.mipmap.kaka,
        age = 22,
        nationality = "Brazil",
        market_value = 67000000.00,
        team = "A.C Milan",
        league = "Serie A",
        goal = 161,
        number = Random.nextInt(0,99)

    )
    private fun randomPlayerName():String{
        val playerNames = arrayOf<String>("Ricardo Kaka", "Dida", "Valerio Fiori", "Zeljko Kalac", "Marco Storai",
        "Luca Antonelli", "Daniele Bonera", "Cafu", "Alessandro Costacurta", "Matteo Darmian", "Giuseppe Favalli", "Leandro Grimi",
        "Marek Jankulovski", "Kakha Kaladze", "Paolo Maldini", "Alessandro Nesta", "Massimo Oddo", "Dario Simic", "Massimo Ambrosini",
        "Gastone Bottini", "Cristian Brocchi", "Gennaro Gattuso", "Yoann Gourcuff", "Alex Guerci", "Andrea Pirlo", "Clarence Seedor",
        "Serginho", "Marco Borriello", "Davide Di Gennaro", "Alberto Gilardino", "Filippo Inzaghi", "Ronaldo")
        return playerNames[Random.nextInt(0,30)]
    }



}