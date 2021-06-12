package com.enigma.playground.hilt.configuration.di

import android.content.Context
import com.enigma.playground.hilt.data.ApiService
import com.enigma.playground.hilt.data.LocalDb
import com.enigma.playground.hilt.data.SharedPrefs
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun getApiService() = ApiService.getInstance()

    @Provides
    fun localDb(@ApplicationContext context: Context) = LocalDb(context)

    @Provides
    fun sharedPrefs(@ApplicationContext context: Context) = SharedPrefs(context)

}