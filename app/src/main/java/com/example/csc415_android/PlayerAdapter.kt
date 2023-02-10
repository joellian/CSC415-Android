package com.example.csc415_android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.csc415_android.ui.Player_Detail_Fragment
import kotlinx.coroutines.NonDisposableHandle.parent

class PlayerAdapter (private val players:List<Player>) : RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.player_card_view, parent, false)
        return PlayerViewHolder(view) {
            position->
            val player = players[position]

            val bundle = bundleOf(
                "name" to player.name,
                "age" to player.age,
                "goal" to player.goal,
                "league" to player.league,
                "nationality" to player.nationality,
                "number" to player.number
            )
            val detailFragment = Player_Detail_Fragment()
            detailFragment.arguments = bundle

            val activity = view.context as AppCompatActivity
            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, detailFragment)
                addToBackStack(null)
            }
        }
    }

    override fun getItemCount() = players.size

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val player = players[position]
//        holder.playerImage.setImageResource(player.image)
        holder.playerImage.setImageResource(player.image)
        holder.playerName.text = player.name
        holder.playerAge.text = player.age.toString()
        holder.playerNationality.text = player.nationality
        holder.playerNumber.text = player.number.toString()
    }
    inner class PlayerViewHolder(
        itemView: View,
        private val onItemClick:(AdapterPosition: Int)-> Unit

    ): RecyclerView.ViewHolder(itemView){
        val playerImage: ImageView = itemView.findViewById(R.id.player_image)
        val playerName: TextView = itemView.findViewById(R.id.player_name)
        val playerAge: TextView = itemView.findViewById(R.id.player_number)
        val playerNationality: TextView = itemView.findViewById(R.id.player_nationality)
        val playerNumber: TextView = itemView.findViewById(R.id.player_number)

        init { //
            itemView.setOnClickListener {
                onItemClick(adapterPosition)
            }
        }

    }


}