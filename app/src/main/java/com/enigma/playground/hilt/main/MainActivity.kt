package com.enigma.playground.hilt.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.enigma.playground.hilt.R
import com.enigma.playground.hilt.analytics.AnalyticsService
import com.enigma.playground.hilt.analytics.FacebookAnalytics
import com.enigma.playground.hilt.analytics.MixPanelAnalytics
import com.enigma.playground.hilt.data.ApiService
import com.enigma.playground.hilt.data.LocalDb
import com.enigma.playground.hilt.data.Repository
import com.enigma.playground.hilt.data.SharedPrefs

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apiService = ApiService.getInstance()
        val localDb = LocalDb(this.applicationContext)
        val sharedPrefs = SharedPrefs(this.applicationContext)
        val mixPanelAnalytics = MixPanelAnalytics()
        val facebookAnalytics = FacebookAnalytics()
        val analyticsService = AnalyticsService(mixPanelAnalytics, facebookAnalytics)
        val repository = Repository(apiService, localDb, sharedPrefs, analyticsService)
        mainViewModel = ViewModelProvider(
            this, MyViewModelFactory(repository, analyticsService)
        ).get(MainViewModel::class.java)
    }
}