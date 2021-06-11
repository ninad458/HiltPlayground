package com.enigma.playground.hilt.data

import com.enigma.playground.hilt.analytics.AnalyticsService

class Repository(
    private val apiService: ApiService,
    private val localDb: LocalDb,
    private val sharedPrefs: SharedPrefs,
    private val analyticsService: AnalyticsService
)