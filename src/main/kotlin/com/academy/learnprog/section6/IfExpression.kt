package com.academy.learnprog.section6

fun main(args: Array<String>) {

    val someCondition = 69 < 22
    var num: Int = if (someCondition) 50 else 592
    // Equivalent in Java: num = someCondition ? 50 : 592

    println("The result of the if expression is ${
        if (someCondition) {
            println("something")
            50
        } else {
            println("something else")
            592
        }
    }")
    println()

    // var num3 = if (someCondition) 50 // Needs both branches

    val x = if (someCondition) {
        println("something")
    } else {
        println("something else")
    }
    println(x.javaClass) // Unit
}
