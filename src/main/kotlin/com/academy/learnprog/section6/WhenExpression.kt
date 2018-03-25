package com.academy.learnprog.section6

import java.math.BigDecimal

fun main(args: Array<String>) {

    val showExample1 = false
    val showExample2 = false
    val showExample3 = false
    val showExample4 = true

    if (showExample1) {
        val num = 150
        /**
         * The 'when' expression
         * Note: doesn't fall through
         */
        when (num) {
            in 100..199 -> println("in range 100..199")
            200, 400 -> println("200 or 400")
            300 -> println("300")
            else -> println("Doesn't match anything")
        }
        println()
    }

    if (showExample2) {
        val num = 100
        val y = 10
        when (num) {
            y + 80 -> println("90")
            y + 90 -> println("100")
            300 -> println("300")
            else -> println("Doesn't match anything")
        }
        println()
    }

    if (showExample3) {
        val obj: Any = "I'm a string"
        val obj2: Any = BigDecimal(25.2)
        val obj3: Any = 45

        val something: Any = obj2
        /**
         * We can convert something like this to a 'when' expression:
         *
         * if (something is String) {
         *     println(something.toUpperCase())
         * } else if (something is BigDecimal) {
         *     println(something.remainder(BigDecimal(10.5)))
         * } else if (something is Int) {
         *     println("${something - 22}")
         * } else {
         *     println("I have no idea what type this is")
         * }
         */
        val z = when (something) {
            is String -> {
                println(something.toUpperCase())
                1
            }
            is BigDecimal -> {
                println(something.remainder(BigDecimal(10.5)))
                2
            }
            is Int -> {
                println("${something - 22}")
                3
            }
            else -> {
                println("I have no idea what type this is")
                0
            }
        }
        println(z)
        println()
    }

    if (showExample4) {
        var num = 100
        val timeOfYear = Season.WINTER
        /**
         * We don't need an 'else' here, because the branches here are exhaustive since
         * we are matching an Enum
         */
        val str = when (timeOfYear) {
            Season.SPRING -> {
                num += 5
                "Flowers are blooming"
            }
            Season.SUMMER -> "It's hot!"
            Season.FALL -> "It's getting cooler"
            Season.WINTER -> {
                num = 22 - 55
                "I need a coat"
            }
        }
        println(str)

        val num2 = -50
        /**
         * We can use 'when' to test a bunch of expressions
         */
        when {
            num < num2 -> println("num is less than num2")
            num > num2 -> println("num is greater than num2")
            else -> println("num = num2")
        }

        println()
    }
}

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}