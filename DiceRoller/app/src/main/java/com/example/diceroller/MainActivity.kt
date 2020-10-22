package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            diceRoll1()
            diceRoll2()
        }
    }
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun diceRoll1() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.dice1)
        resultTextView.text = diceRoll.toString()
    }
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun diceRoll2() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.dice2)
        resultTextView.text = diceRoll.toString()
    }
}

/**
 * Dice Class that takes the number of sides on the dice
 * and one function that returns a random number on the dice
 */
class Dice(private val numSides: Int){
    fun roll(): Int{
        return (1..numSides).random()
    }
}