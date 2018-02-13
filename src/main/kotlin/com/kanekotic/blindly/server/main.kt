package com.kanekotic.blindly.server

import org.koin.dsl.module.applicationContext
import org.koin.standalone.StandAloneContext.startKoin


fun main(args: Array<String>) {
    val module = applicationContext {
        provide { Server() }
    }
    startKoin(listOf(module))

    Bootstrap()

}