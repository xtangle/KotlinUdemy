package com.academy.learnprog.section7.collections

fun main(args: Array<String>) {

    val setInts = setOf(10, 15, 19, 5, 3, -22) // Immutable
    println(setInts.javaClass) // java.util.LinkedHashSet
    println(setInts.plus(20))   // [10, 15, 19, 5, 3, -22, 20]
    println(setInts.plus(10))   // [10, 15, 19, 5, 3, -22]
    println(setInts.minus(19))  // [10, 15, 5, 3, -22]
    println(setInts.minus(100)) // [10, 15, 19, 5, 3, -22]
    println(setInts.average())  // 5.0
    println(setInts.drop(3))    // [5, 3, -22], drops the first three elements
    println()

    val mutableInts = mutableSetOf(1, 2, 3, 4, 5)
    println(mutableInts.javaClass) // java.util.LinkedHashSet
    mutableInts.plus(10)  // plus function does not actually change the set but returns a new one!
    println(mutableInts) // [1, 2, 3, 4, 5]
    mutableInts.add(10)
    println(mutableInts) // [1, 2, 3, 4, 5, 10]
}