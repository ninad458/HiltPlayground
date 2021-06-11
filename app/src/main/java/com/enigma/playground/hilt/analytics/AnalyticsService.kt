package com.enigma.playground.hilt.analytics

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AnalyticsService @Inject constructor(
    private val mixPanelAnalytics: MixPanelAnalytics,
    private val facebookAnalytics: FacebookAnalytics
)