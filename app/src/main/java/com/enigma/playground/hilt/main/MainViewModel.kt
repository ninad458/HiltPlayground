package com.enigma.playground.hilt.main

import androidx.lifecycle.ViewModel
import com.enigma.playground.hilt.analytics.AnalyticsService
import com.enigma.playground.hilt.data.Repository

class MainViewModel(
    private val repository: Repository,
    private val analyticsService: AnalyticsService
) : ViewModel()