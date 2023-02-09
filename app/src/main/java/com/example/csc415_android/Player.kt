package com.example.csc415_android

data class Player(
    val nationality: String,
    val name: String,
    val age: Int,
    val image: Int,
    val value: Int,
    val team: String,
    val league: String,
    val goal: List<Int>,
    val trophy: List<String>
)
