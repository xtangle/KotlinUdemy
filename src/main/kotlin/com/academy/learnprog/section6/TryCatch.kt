package com.academy.learnprog.section6

fun main(args: Array<String>) {

    val showExample1 = false
    val showExample2 = true

    if (showExample1) {
        println(getNumber("22"))
        println(getNumber("22.5") ?: "I can't print the result")
        println(getNumber("22.5") ?: throw IllegalArgumentException("Number isn't an Int"))
        println()
    }

    if (showExample2) {
        notImplementedYet("string")
    }
}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch(e: NumberFormatException) {
        null
    } finally {
        println("I'm in the finally block")
        1 // The expression is unused, it won't be returned. No value can be returned in the finally block.
    }
}

fun notImplementedYet(something: String): Nothing {
    throw IllegalArgumentException("Implement me!")
}