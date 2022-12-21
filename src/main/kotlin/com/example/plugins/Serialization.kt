package com.example.plugins

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*

/**
 * A plugin that serves two primary purposes:
 * - Negotiating media types between the client and server. For this, it uses the `Accept` and `Content-Type` headers.
 * - Serializing/deserializing the content in a specific format.
 *    Ktor supports the following formats out-of-the-box: `JSON`, `XML`, and `CBOR`.
 *
 * You can learn more from [Content negotiation and serialization](https://ktor.io/docs/serialization.html).
 */
fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}
