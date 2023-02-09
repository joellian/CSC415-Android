package com.example.csc415_android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlayerAdapter (private val players:List<Player>) : RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PlayerViewHolder (
        LayoutInflater.from(parent.context).
        inflate(R.layout.player_card_view,parent,false)
    )

    override fun getItemCount() = players.size

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val player = players[position]
        holder.playerImage.setImageResource(player.image)
        holder.playerName.text = player.name
        holder.playerAge.text = player.age.toString()
    }
    class PlayerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val playerImage: ImageView = itemView.findViewById(R.id.player_image)
        val playerName: TextView = itemView.findViewById(R.id.player_name)
        val playerAge: TextView = itemView.findViewById(R.id.player_age)

    }


}