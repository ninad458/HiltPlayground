package com.enigma.playground.hilt.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.enigma.playground.hilt.R

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}