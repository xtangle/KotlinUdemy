package com.academy.learnprog.section7.generics

import java.math.BigDecimal

fun main(args: Array<String>) {

    val mixedList: List<Any> = listOf("string", 1, BigDecimal("22.5"), "fall", BigDecimal("-5938.393849"))
    val bigDecimalsOnly = getElementsOfType<BigDecimal>(mixedList)
    println(bigDecimalsOnly) // [22.5, -5938.393849]
    println()

    val stringsOnly = getElementsOfType<String>(mixedList)
    println(stringsOnly) // [string, fall]
    println()
}

/*
fun <T> getElementsOfType(list: List<Any>): List<T> {
    val newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) { // error: Cannot check for instance of erased type T
            newList.add(element)
        }
    }
    return newList
}
*/

/**
 * Reification is a Kotlin feature that prevents the type from being erased at runtime.
 * To do that, we need to declare the function as inline and specify that type T is reified.
 */
inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    val newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) {
            newList.add(element)
        }
    }
    return newList
}