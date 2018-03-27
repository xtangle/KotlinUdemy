package com.academy.learnprog.section7

fun main(args: Array<String>) {

    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.filter { it % 2 != 0 }) // [15, 19, 5, 3]

    val immutableMap = mapOf(
        1 to Car2("green", "Toyota", 2015),
        2 to Car2("red", "Ford", 2016),
        3 to Car2("silver", "Honda", 2013)
    )
    println(immutableMap.filter { it.value.year == 2016 })

    val mutableMap = immutableMap.toMutableMap()
    mutableMap.filter { it.value.color == "silver" }
    println("The filtered map is $mutableMap") // The filter function returns a new map!
    println()

    val ints = arrayOf(1, 2, 3, 4, 5)
    /*
    val add10List: MutableList<Int> = mutableListOf()
    for (i in ints) {
        add10List.add(i + 10)
    }
    println(add10List)  // [11, 12, 13, 14, 15]
    */
    val add10List = ints.map { it + 10 }
    println(add10List) // [11, 12, 13, 14, 15]
    println(add10List.javaClass) // java.util.ArrayList
    println()

    val carsMap =  mapOf(
        1 to Car2("green", "Toyota", 2015),
        2 to Car2("red", "Ford", 2016),
        3 to Car2("silver", "Honda", 2013),
        17 to Car2("red", "BMW", 2015),
        8 to Car2("green", "Ford", 2010)
    )
    println(carsMap.filter { it.value.model == "Ford" }
        .map { it.value.color }) // [red, green]
    println(carsMap.all { it.value.year > 2014 }) // false
    println(carsMap.any { it.value.year > 2014 }) // true
    println(carsMap.count { it.value.year > 2014 }) // 3
    println(carsMap.toSortedMap()) // sorted by key
    println()

    val cars = carsMap.values
    println(cars.find { it.year > 2014 }) // Car2(color=green, model=Toyota, year=2015)
    println(cars.groupBy { it.color }) // {green=[<2 cars>], red=[<2 cars>], silver=[<1 car>]}
    println(cars.sortedBy { it.year }) // sorted by year
}

data class Car2(val color: String, val model: String, val year: Int)