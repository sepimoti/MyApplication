package com.example.myapplication

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class DiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)
        val btnDice=findViewById<ImageButton>(R.id.btnDice)
        val imgDice=findViewById<ImageView>(R.id.imgDice)
        btnDice.setOnClickListener {
            var random=Random.nextInt(6)+1
            when(random){
                1 -> imgDice.setImageResource(R.drawable.dice1)
                2 -> imgDice.setImageResource(R.drawable.dice2)
                3 -> imgDice.setImageResource(R.drawable.dice3)
                4 -> imgDice.setImageResource(R.drawable.dice4)
                5 -> imgDice.setImageResource(R.drawable.dice5)
                6 -> {imgDice.setImageResource(R.drawable.dice6)
                Toast.makeText(this,"Congratulations!",Toast.LENGTH_SHORT).show()}
                else -> imgDice.setImageResource(R.drawable.ic_baseline_360_24)
            }
        }
    }
}