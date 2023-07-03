package com.siriusbase

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.siriusbase.plugins.*

fun main() {
    printMovies()

    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun printMovies() {
    with(MoviesScopeFunctions()) {
        noScope()
        let()
    }
}

fun Application.module() {
    configureSerialization()
    configureDatabases()
    configureMonitoring()
    configureSecurity()
    configureRouting()
}
