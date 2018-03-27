package com.academy.learnprog.section7

fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "winter", "summer")
    val colorList = listOf("black", "white", "red", "black", "red")

    println(strings.last())
    println(strings.asReversed())
    /*
    if (strings.size > 5) {
        println(strings[5])
    } else {
        println("No element")
    }
    */
    println(strings.getOrNull(5) ?: "No element")
    val ints = listOf(1, 2, 3, 4, 5)
    println(ints.max())
    println()

    println(colorList.zip(strings))
    val mergedLists = listOf(colorList, strings)
    println(mergedLists)
    val combinedList = colorList + strings
    println(combinedList)
    println()

    val noDupsList = colorList.union(strings)
    println(noDupsList)
    val noDupColors = colorList.distinct()
    println(noDupColors)
    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("some other season")
    println(mutableSeasons)
    println()
}