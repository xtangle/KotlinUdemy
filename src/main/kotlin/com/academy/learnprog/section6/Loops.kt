package com.academy.learnprog.section6

fun main(args: Array<String>) {

    val showExample1 = false
    val showExample2 = false
    val showExample3 = true

    /**
     * Example 1
     */
    if (showExample1) {
        for (i in 1..5) println(i)
        println()

        val end = 5
        for (i in 1 until end) println(i)
        println()

        for (i in 3..15 step 3) println(i)
        println()

        for (c in 'z' downTo 'a' step 5) println(c)
        println()

        // ClosedRange<String> does not have an iterator() method
        // for (s in "ABC".."XYZ") println(s)

        val str = "Hello"
        for (c in str) println(c)
        println()
    }

    /**
     * Example 2
     */
    if (showExample2) {
        val seasons: Array<String> = arrayOf("spring", "summer", "fall", "winter")
        for (season in seasons) println(season)
        println()

        val notASeason: Boolean = "whatever" !in seasons
        println(notASeason)
        val notInRange = 32 !in 1..10
        println(notInRange)
        val str = "Hello"
        println('e' in str)
        println('e' !in str)
        println()

        for (index in seasons.indices) println("${seasons[index]} is season number ${index + 1}")
        println()

        seasons.forEachIndexed { index, value -> println("$value is season number ${index + 1}") }
        println()
    }

    /**
     * Example 3
     */
    if (showExample3) {
        for (i in 1..3) {
            println("i = $i")
            jLoop@ for (j in 1..3) {
                println("j = $j")
                for (k in 1..3) {
                    // If k = 3, break out of both the k- and j- loops
                    if (k == 3) {
                        break@jLoop
                        // or we could use continue@jLoop to continue in the jLoop
                    }
                    println("k = $k")
                }
            }
        }
    }
}