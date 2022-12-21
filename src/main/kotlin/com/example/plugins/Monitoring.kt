package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.plugins.callloging.*

/**
 * A plugin that allows you to log incoming client requests.
 * You can configure [CallLogging] in multiple ways: specify a logging level,
 * filter requests based on a specified condition, customize log messages, and so on.
 *
 * You can learn more from [Call logging](https://ktor.io/docs/call-logging.html).
 */
fun Application.configureMonitoring() {
    install(CallLogging)

}
