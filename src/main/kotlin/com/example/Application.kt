package com.example

import io.ktor.server.application.*
import com.example.plugins.*
import io.ktor.server.routing.*

/**
 * Start server engine
 */
fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

/**
 * Sets application plugins.
 */
@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureKoin()
    configureSerialization()
    configureMonitoring()
    configureRouting()
    configureDefaultHeader()
    configureStatusPages()
}
