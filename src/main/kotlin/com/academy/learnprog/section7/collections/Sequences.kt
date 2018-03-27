package com.academy.learnprog.section7.collections

fun main(args: Array<String>) {

    /**
     * Every function call in a chain of function calls for collections creates an intermediate collection instance
     * One way to avoid the creation of intermediate instances is using sequences.
     * Another use case for sequences is when we don't know how large a collection will be.
     *
     * Sequences is pretty much the same as "streams" in Java.
     * Kotlin re-implemented this because Java streams aren't available in every platform
     *   (eg. on Android in the past, Java 8 is not fully supported).
     * One way to view sequences (streams) is as a continuous stream of elements.
     * Like streams in Java, there are two types of operations on sequences:
     *   - intermediate operation - return a sequence and are LAZY
     *   - terminal operations - return a concrete collection or value and
     *       evaluates intermediate operations in an optimized manner
     *
     * Note: We ONLY want to use sequences when we have a large collection, because Kotlin
     *   collections when they're small are very efficient.
     */
    val carsMap =  mapOf(
        1 to Car2("green", "Toyota", 2015),
        2 to Car2("red", "Ford", 2016),
        3 to Car2("silver", "Honda", 2013),
        17 to Car2("red", "BMW", 2015),
        8 to Car2("green", "Ford", 2010)
    )
    println(carsMap.asSequence()
        .filter { it.value.model == "Ford" }
        .map { it.value.color }
        .toList()) // [red, green]
    println()

    val result = listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("mapping $it"); it.toUpperCase() } // "mapping Mary" is not printed
        .toList()
    println(result)
    println()

    /**
     * The order in which we chain functions together matters!
     */
    val result2 = listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("mapping $it"); it.toUpperCase() }
        .find { it.endsWith('E') } // Only Joe is evaluated,
        // also note 'find' is a terminal operation which returns a nullable type
    println(result2)
    println()
}