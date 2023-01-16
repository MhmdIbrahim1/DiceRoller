package com.mohamedibrahim.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mohamedibrahim.diceroller.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener{
            rollDice()
        }

    }

    private fun rollDice() {
        val randomRoll =  Random().nextInt(6) + 1
        val roll = when(randomRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.rollDice.setImageResource(roll)
        Toast.makeText(this, "Rolled is $randomRoll",Toast.LENGTH_SHORT).show()
    }
}