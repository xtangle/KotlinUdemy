package com.academy.learnprog.section7.generics

fun main(args: Array<String>) {

    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short?> = listOf(10, 20, 30, 40)
    val floats: List<Float?> = listOf(100.3f, -459.43f, 3.5f)
    val strings = listOf("1", "2", "3")

    convertToInt(ints)
    convertToInt(shorts)
    convertToInt(floats)
    // convertToInt(strings) // compile time error
    println()

    append(StringBuilder("String1"), StringBuilder("String2"))
    // printCollection(shorts) // error, because shorts is of type List<Short?>
    printCollection(strings)
    println()
}

// <T> is equivalent to <T: Any?>
// <T: Number> means T is a Number or a subclass of Number
fun <T: Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        print("${num?.toInt()} ")
    }
    println()
}

// Restrict to only non-nullable types
fun <T: Any> printCollection(collection: List<T>) {
    for (item in collection) {
        print("$item ")
    }
    println()
}

// If a type parameter has multiple constraints, they all need to be placed in the 'where' clause
fun <T> append(item1: T, item2: T) where T: CharSequence, T: Appendable {
    println("Result is ${item1.append(item2)}")
}