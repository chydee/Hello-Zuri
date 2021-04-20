package com.android.hellozuri

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.hellozuri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handleButtonClick()
    }

    /**
     *   Separate function for listening to Button clicks
     */
    private fun handleButtonClick() {
        binding.incrementCountBtn.setOnClickListener {
            incrementCount()
        }
    }

    /**
     *  Increments the counter by 1 and set the text to the TextView
     */
    private fun incrementCount() {
        count += 1
        binding.showCountsTextView.text = count.toString()
    }
}