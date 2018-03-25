package com.academy.learnprog.section5.anotherpackage

internal fun functionFromAnotherPackage(str: String) {
    println("From another package: $str")
}

internal fun String.toUpperMiddle(): String {
    val middleIndex = length / 2
    return substring(0, middleIndex) + this[middleIndex].toUpperCase() + substring(middleIndex + 1, length)
}