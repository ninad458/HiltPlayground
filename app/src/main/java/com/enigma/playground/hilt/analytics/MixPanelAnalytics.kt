package com.enigma.playground.hilt.analytics

import android.util.Log
import javax.inject.Inject

class MixPanelAnalytics @Inject constructor() {
    fun log(key: String, vararg params: Pair<String, Any?>) {
        val props = mapOf(*params)
        Log.d(TAG, "{log : {$key : $props}}")
    }

    companion object {
        private const val TAG = "MixPanelAnalytics"
    }
}