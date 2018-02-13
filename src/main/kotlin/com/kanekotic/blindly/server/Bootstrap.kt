package com.kanekotic.blindly.server

import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class Bootstrap : KoinComponent {

    private val app : Server by inject()

    init {
        app.start()
    }
}