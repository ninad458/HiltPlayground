package com.enigma.playground.hilt.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.enigma.playground.hilt.analytics.AnalyticsService
import com.enigma.playground.hilt.data.Repository

class MyViewModelFactory(
    private val repository: Repository,
    private val analyticsService: AnalyticsService
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(repository, analyticsService) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}