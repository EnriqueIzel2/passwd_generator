package com.example.passwordgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passwordgenerator.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
  private lateinit var binding: ActivityMainBinding

  private val alphabet = arrayOf(
    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
    "O", "P", "K", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
  )

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.btnGeneratePasswd.setOnClickListener {
      binding.textPassword. text = generatePassword()
    }
  }

  private fun generatePassword(): String {
    val firstChoice = (alphabet.indices).random()
    val secondChoice = (alphabet.indices).random()

    val firstLetter = alphabet[firstChoice]
    val secondLetter = alphabet[secondChoice]

    val numbers = Random.nextInt(1000, 9999)

    return "$firstLetter$secondLetter-$numbers"
  }
}