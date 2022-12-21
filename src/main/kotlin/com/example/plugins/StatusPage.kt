package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*

/**
 * A plugin that handles exceptions and status codes. Useful to configure default error pages.
 */
fun Application.configureStatusPages() {
    install(StatusPages) {
        status(HttpStatusCode.NotFound) { call, _ ->
            call.respond(
                message = "Page not Found.",
                status = HttpStatusCode.NotFound
            )
        }
    }
}