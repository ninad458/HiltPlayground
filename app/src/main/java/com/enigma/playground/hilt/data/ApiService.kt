package com.enigma.playground.hilt.data

interface ApiService {

    companion object {
        fun getInstance(): ApiService {
            // configure Okhttp
            // configure baseurl
            // configure Gson
            return object : ApiService {

            }
        }
    }
}