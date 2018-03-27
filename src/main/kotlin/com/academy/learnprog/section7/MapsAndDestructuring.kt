package com.academy.learnprog.section7

fun main(args: Array<String>) {
    val immutableMap: Map<Int, Car> = mapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013)
    )
    println(immutableMap.javaClass) // java.util.LinkedHashMap
    println(immutableMap)

    val mutableMap = mutableMapOf(
        "John's car" to Car("red", "Range Rover", 2010),
        "Jane's car" to Car("blue", "Hyundai", 2012)
    )
    mutableMap["Mary's car"] = Car("red", "Corvette", 1965)
    println(mutableMap.javaClass) // java.util.LinkedHashMap
    println(mutableMap)

    // Note: example below is not from the video, there's probably a better way to do this!
    val hashMap = hashMapOf(*mutableMap.entries.map { it.toPair() }.toTypedArray())
    println(hashMap.javaClass) // java.util.HashMap
    println(hashMap)
    println()

    val pair = Pair(10, "ten")
    // val firstValue = pair.first
    // val secondValue = pair.second
    val (firstValue, secondValue) = pair // Equivalent to the above, it's called "destructuring"
    println(firstValue)
    println(secondValue)
    println()

    // Destructuring declaration
    for ((key, value) in mutableMap) {
        println(key)
        println(value)
    }
    println()

    val car = Car("blue", "Corvette", 1959)
    val (color, model, year) = car
    println("color = $color, model = $model, year = $year")

    // Destructuring for data classes is free
    val car2 = DataCar("brown", "Jaguar", 2005)
    val (color2, model2, year2) = car2
    println("color2 = $color2, model2 = $model2, year2 = $year2")
}

class Car(private val color: String, val model: String, val year: Int) {
    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year
}

/**
 * Data classes get destructuring for free!
 */
data class DataCar(val color: String, val model: String, val year: Int)