package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*
import java.time.Duration

/**
 * A plugin that adds the standard `Date` and `Server` HTTP headers into each response and allows you to:
 * - add additional default headers;
 * - override the `Server` header.
 *
 * You can learn more from [Default headers](https://ktor.io/docs/default-headers.html).
 */
fun Application.configureDefaultHeader() {
    install(DefaultHeaders) {
        val oneYearInSeconds = Duration.ofDays(365).seconds
        header(
            name = HttpHeaders.CacheControl,
            value = "public, max-age=$oneYearInSeconds, immutable"
        )
    }
}