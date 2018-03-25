package com.academy.learnprog.section5

fun main(args: Array<String>) {
    val s = "this is all in lowercase"
    println(s.upperFirstAndLast())
    // println(s.toUpperCase())
}

fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}

/*
fun String.toUpperCase(): String {
    return "custom uppercase: $this"
}
*/