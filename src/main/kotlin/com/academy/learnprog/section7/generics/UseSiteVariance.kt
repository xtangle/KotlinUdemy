package com.academy.learnprog.section7.generics

fun main(args: Array<String>) {

    val cars1 = mutableListOf(Car(), Car())
    val cars2: MutableList<Car> = mutableListOf()
    copyCars(cars1, cars2)

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()
    copyCars(fords1, fords2)

    copyCars(fords1, cars2)
}

open class Car
class Toyota: Car()
class Ford: Car()

/**
 * Note, we only read the source and only write the destination
 * Use 'use site variance', also called 'type projection'
 * In Java, it is similar to the '?' wildcard:
 * - ? extends Car  <==>  out T
 * - ? super Car    <==>  in T
 */
fun <T: Car> copyCars(source: MutableList<out T>, destination: MutableList<T>) {
    for (car in source) {
        destination.add(car)
    }
}