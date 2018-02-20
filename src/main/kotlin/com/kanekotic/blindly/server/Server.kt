package com.kanekotic.blindly.server

import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.CORS
import io.ktor.features.CallLogging
import io.ktor.features.ConditionalHeaders
import io.ktor.features.DefaultHeaders
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.netty.NettyApplicationEngine


class Server {
    fun start(){
        val server: NettyApplicationEngine = embeddedServer(Netty, 8080) {
            install(DefaultHeaders)
            install(CallLogging)
            install(ConditionalHeaders)
            install(CORS)
            routing {
                get("/") {
                    call.respondText("Hello Blindly")
                }
            }
        }
        server.start(wait = true)

    }
}