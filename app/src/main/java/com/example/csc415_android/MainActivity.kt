package com.example.csc415_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.csc415_android.ui.Player_Detail_Fragment
import com.example.csc415_android.R.id.player_recycler_view
import com.example.csc415_android.ui.Player_List_Fragment
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.fragment_container_view, Player_List_Fragment())
            addToBackStack(null)
        }
    }
}
