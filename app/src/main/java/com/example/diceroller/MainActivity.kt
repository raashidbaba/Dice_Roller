package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.btClick)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomNumb = findViewById<TextView>(R.id.tvOne)
        val random = Random.nextInt(6) + 1
        randomNumb.text = random.toString()
    }
}