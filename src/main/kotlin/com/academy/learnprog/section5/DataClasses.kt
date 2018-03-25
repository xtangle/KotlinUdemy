package com.academy.learnprog.section5

val MY_CONSTANT = 100

fun main(args: Array<String>) {
    println(MY_CONSTANT)
    println()

    val emp = Employee("John")
    val emp2 = Employee("John")
    println(emp == emp2) // False, since we didn't override equals
    println()

    val car = Car("blue", "Toyota", 2015)
    val car2 = Car("blue", "Toyota", 2015)
    println(car == car2) // True, since for data classes we get equals for free
    println()

    println(car)
    val car3 = car.copy()
    println(car3)
    val car4 = car.copy(year = 2016, color = "green")
    println(car4)
}

/**
 * Data Class:
 * Primary constructor must have at least 1 parameter, and all parameters must be val or var.
 * Has toString, hashCode, equals, and copy functions for free. They can still be overridden.
 */
data class Car(val color: String, val model: String, val year: Int)