package com.jlrm01.bubble

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jlrm01.bubble.databinding.ActivityMainBinding
import com.jlrm01.bubble.databinding.BubbleLayoutBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bubble: BubbleLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        bubble = BubbleLayoutBinding.inflate(layoutInflater)
        val bubble2 = BubbleLayoutBinding.inflate(layoutInflater)

        setContentView(binding.root)

        bubble.editTextTextPersonName.setText("Hi there!")
        bubble2.editTextTextPersonName.setText("This is the second bubble!")

        binding.root.addView(bubble.root)
        binding.root.addView(bubble2.root)
    }
}