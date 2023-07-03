package com.siriusbase

class MoviesScopeFunctions {
    fun noScope() {
        val movie = Movie("Matrix", "Action", 1999, "Wachowski")
        println(movie)
    }

    fun let() {
        Movie("Pulp Fiction", "Comedy", 1988, "Quentin Tarantino").let {
            println(it)
            it.genre="Crime"
            it.year=1994
            println(it)
        }
    }
}