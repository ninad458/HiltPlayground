package com.enigma.playground.hilt

import android.app.Application
import android.content.Context
import com.enigma.playground.hilt.data.LocalDb

class App : Application() {

    private lateinit var localDb: LocalDb

    fun getLocalDb(): LocalDb {
        if (!::localDb.isInitialized) {
            localDb = createLocalDb(this)
        }
        return localDb
    }

    companion object {
        fun createLocalDb(context: Context) = LocalDb(context.applicationContext)
    }
}