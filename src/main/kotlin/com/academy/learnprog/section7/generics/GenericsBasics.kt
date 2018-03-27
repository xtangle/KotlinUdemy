package com.academy.learnprog.section7.generics

import java.math.BigDecimal

fun main(args: Array<String>) {

    // val list: MutableList // error: we must specify the type, unlike in Java
    // list[0].toUpperCase()

    val list = mutableListOf("Hello")
    list.add("another string")
    printCollectionTopLevel(list)

    val bdList = mutableListOf(BigDecimal("-33.45"), BigDecimal("3503.99"), BigDecimal("0.329"))
    printCollectionTopLevel(bdList)

    list.printCollection()
    bdList.printCollection()
    println()
}

// The '<T>' is called a type parameter declaration
fun <T> printCollectionTopLevel(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
    println()
}

fun <T> List<T>.printCollection() {
    for (item in this) {
        println(item)
    }
    println()
}