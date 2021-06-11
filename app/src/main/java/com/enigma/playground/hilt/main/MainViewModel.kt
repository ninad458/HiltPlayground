package com.enigma.playground.hilt.main

import androidx.lifecycle.ViewModel
import com.enigma.playground.hilt.analytics.AnalyticsService
import com.enigma.playground.hilt.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository,
    private val analyticsService: AnalyticsService
) : ViewModel()