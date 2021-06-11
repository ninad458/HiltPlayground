package com.enigma.playground.hilt.data

import com.enigma.playground.hilt.analytics.AnalyticsService
import javax.inject.Inject

class Repository @Inject constructor(
    private val apiService: ApiService,
    private val localDb: LocalDb,
    private val sharedPrefs: SharedPrefs,
    private val analyticsService: AnalyticsService
)