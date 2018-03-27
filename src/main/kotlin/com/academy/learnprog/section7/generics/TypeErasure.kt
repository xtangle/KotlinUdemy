package com.academy.learnprog.section7.generics

fun main(args: Array<String>) {
    val strings = listOf("1", "2", "3")

    // Can we use the 'is' operator on collections? Yes!
    // But doesn't this contradict with Java's type erasure?
    // What happens is (probably, need to verify?) that this if statement isn't even generated,
    // the compiler will check at compile time and will know that it is always true.
    if (strings is List<String>) {
        println("This list contains strings")
    }

    // Can we 'trick' the compiler if we give it a List<Any> where all elements are strings?
    // No, because it would have to check at runtime, and it can't, because of type erasure.
    var listAny: List<Any> = listOf("str1", "str2")
    // if (listAny is List<String>) // error: Cannot check for instance of erased type: List<String>

    // How can we check if something is a List?
    // Use the 'star projection' syntax (i.e. wildcard)
    // if (listAny is List) // error: One type argument expected. Use 'List<*>' if you don't want to pass type arguments.
    if (listAny is List<*>) {
        println("Yes, this is a list. Thank you star projection!")
    }
    println()

    // What about casting with generics?
    listAny = listOf(1, 2, 3)
    if (listAny is List<*>) {
        println("From herein this list shall contain strings")
        // Compiler gives a warning: Unchecked cast: List<Any> to List<String>
        val strList = listAny as List<String>
        // error: java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        println(strList[1].replace("str", "string"))
        // If we had defined listAny = listOf(1, "str", 3), then we don't get any exception,
        // confirming that the cast happens at runtime
    }
}