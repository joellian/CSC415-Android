package com.example.csc415_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.csc415_android.R.id.player_recycler_view
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(player_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val players = mutableListOf<Player>()

        for(i in 0 .. 30 ){
            players.add(createPlayer())
        }
        val adapter = PlayerAdapter(players)
        recyclerView.adapter = adapter


    }
    private fun createPlayer()= Player(
        name = "Ricardo Kaka",
        image = ,
        age = Random.nextInt(10,35),
        nationality = "Brazil"
        value = ,
        team = ,
        league = ,
        goal = 4,
        trophy =,



    )
}
