package com.academy.learnprog.section7

fun main(args: Array<String>) {

    // Immutable means immutable only in Kotlin. In Java, it could potentially still be mutated. Here's an example.
    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass) // java.util.Arrays$ArrayList (the same type returned by Arrays.asList() in Java),
    // which is a MUTABLE list in Java (we cannot add/remove elements, but we can change the elements using set())
    // Kotlin makes it IMMUTABLE by not having any functions in the Kotlin List interface that can change the ArrayList.
    // Since it is mutable in Java, there are ways to get around the immutability when using this in Java.

    val emptyList = emptyList<String>()
    println(emptyList.javaClass) // kotlin.collections.EmptyList

    if (emptyList.isNotEmpty()) {
        println(emptyList[0])
    }

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList) // [hello, goodbye]

    val arrayList = arrayListOf(1, 2, 4)
    println(arrayList.javaClass) // java.util.ArrayList, which is a MUTABLE list

    val mutableList = mutableListOf(1, 2, 3) // Explicitly ask for a mutable list
    println(mutableList.javaClass) // java.util.ArrayList, which is a MUTABLE list
    mutableList[1] = 20
    println(mutableList)

    // Creating a list from an array
    val array = arrayOf("black", "white", "green")
    // val colorList = listOf(*array) // Can use the spread operator, or just use toList()
    val colorList = array.toList()
    println(colorList)

    // Converting a primitive array to a list
    val ints = intArrayOf(1, 2, 3)
    println(ints.toList())
}