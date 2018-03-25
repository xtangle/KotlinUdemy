package com.academy.learnprog.section6

fun main(args: Array<String>) {

    /**
     * Range operator (inclusive)
     * Any set that is comparable (eg. Int, Char, Strings, ...) can be used in a range operator
     * It uses the 'in' operator to test if a value is in the range (hence it has to be comparable)
     */
    val range: IntRange = 1..5
    val charRange: CharRange = 'a'..'z'
    val stringRange: ClosedRange<String> = "ABC".."XYZ"

    println(range.joinToString())
    println(charRange.joinToString())
    println("DEF is in stringRange: ${"DEF" in stringRange}")
    println("AAB is in stringRange: ${"AAB" in stringRange}")
    println()

    val backwardRange = 5.downTo(1)
    // val r = 5..1 // Can't use this, resulting range is empty
    val stepRange: IntRange = 3..15
    // Step and downTo and the likes can only be used for numeric types and char
    val stepThree: IntProgression = stepRange.step(3)
    val reversedRange = stepThree.reversed()

    println(reversedRange.joinToString())
    println()

    /**
     * Range operator (exclusive)
     */
    val exclusiveRange = 1 until 5
    println(exclusiveRange.joinToString())
}