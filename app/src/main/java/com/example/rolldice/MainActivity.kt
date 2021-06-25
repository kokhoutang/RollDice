package com.example.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRollDice :Button = findViewById(R.id.btnRoll)

        btnRollDice.setOnClickListener(){

            getDiceNum()
        }
    }

    private fun getDiceNum(){

        val randomNum = (1..6).random()

        val txtResult :TextView = findViewById(R.id.txtNum)

        txtResult.text = randomNum.toString()
    }
}