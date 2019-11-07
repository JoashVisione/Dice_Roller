package com.visione.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener{
            rollDice()
        }
        val btn: Button = findViewById(R.id.roll_button)


    }

    fun rollDice(){

        val randint = Random().nextInt(6) + 1

        val rollText: TextView = findViewById(R.id.roll_text)

        rollText.text = randint.toString()

    }
}
