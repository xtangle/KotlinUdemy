package com.academy.learnprog.section4

import com.academy.learnprog.section4.javacode.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {
    // Arrays example
    println("Arrays example")
    println()

    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L, 4L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)
    val longs3 = arrayOf(1, 2, 3, 4)

    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)

    println(longs1[1])

    // Constructing Arrays
    println("\nConstructing Arrays")

    val evenNumbers = Array(16) { i -> i * 2 }
    println(evenNumbers.joinToString(","))

    val lotsOfNumbers = Array(100000) { i -> i + 1 }
    val allZeroes = Array(100) { 0 }
    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    /*
    for (number in someArray) {
        println(number)
    }*/
    println()
    someArray = Array(6) { i -> (i + 1) * 10 }
    for (number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    println()
    for (element in mixedArray) {
        println(element)
    }
    println("mixedArray is an Array<Any>: ${mixedArray is Array<Any>}")

    // Calling on method accepting a primitive array
    println()
    println("Primitive example")
    val myIntArray = arrayOf(3, 9, 434, 2, 33)
    // DummyClass().printNumbers(myIntArray) // Doesn't work, type mismatch: IntArray != Array<Int>
    val myIntArray2 = intArrayOf(3, 9, 434, 2, 33)
    DummyClass().printNumbers(myIntArray2) // Now works. Note we also get a slight performance boost

    println()
    // var someOtherArray = Array<Int>(5) // Doesn't work, we call the Array constructor here, which expects 2 args
    var someOtherArray2 = IntArray(5) // Works, because for primitive int arrays the default value is 0
    DummyClass().printNumbers(someOtherArray2)

    // We can convert an Array<Int> to an IntArray
    println()
    DummyClass().printNumbers(myIntArray.toIntArray())
    // We can also convert an IntArray to an Array<Int>
    println()
    println(myIntArray2.toTypedArray().joinToString(","))
}