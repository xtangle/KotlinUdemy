package com.academy.learnprog.section4

fun main(args: Array<String>) {

    // Note: We didn't have to specify a type of Int?, compiler is smart enough to know that
    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts) {
        println(i)
    }

    println(nullableInts[3].toString())
}