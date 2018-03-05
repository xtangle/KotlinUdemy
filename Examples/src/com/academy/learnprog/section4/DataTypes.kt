package com.academy.learnprog.section4

import com.academy.learnprog.section4.javacode.DummyClass
import kotlin.reflect.full.isSubclassOf
import kotlin.reflect.full.isSuperclassOf

fun main(args: Array<String>) {
    // Data types
    println("Data types")

    val myInt = 10 // Int is the default data type for whole numbers
    println("default datatype for whole numbers is Int: ${myInt is Int}")
    var myLong = 22L

    // myLong = myInt // Kotlin does not do automatic widening of numbers
    myLong = myInt.toLong()

    val myByte: Byte = 111 // Has to specify type, otherwise will be an Int
    var myShort: Short
    // myShort = myByte
    myShort = myByte.toShort()

    var myDouble = 65.984 // Double is the default data type for floating point numbers
    println("default datatype for floating point numbers is Double: ${myDouble is Double}")

    val myFloat = 838.8492f
    println("myFLoat is a float: ${myFloat is Float}")
    // myDouble = myFloat
    myDouble = myFloat.toDouble()

    val char = 'b'
    // val myChar: Char = 65 // Numbers cannot be assigned to characters
    val myCharInt = 65
    println(myCharInt.toChar())

    val myBoolean = true

    // What if Java code we're using wants a primitive? We don't have to do anything special
    // Because Kotlin classes compile to primitive types under the covers
    println("\nPrimitive example")
    val vacationTime = false // gets compiled to 'boolean' primitive
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

    // Any example
    println("\nAny example")
    // Any is the root of the Kotlin class hierarchy. Any Kotlin class has Any as a superclass.
    println("Any is a superclass of String: ${Any::class.isSuperclassOf(String::class)}")
    println("Any is a subclass of String: ${Any::class.isSubclassOf(String::class)}")

    // Nothing example
    println("\nNothing example")
    // Nothing is used when a function is never going to return, eg. as the return type of a function that always
    // throws an exception. An object of type Nothing can never be instantiated.
    // Any Kotlin class has Nothing as a subclass (NOTE: THEN WHY 2ND EXAMPLE IN THE FOLLOWING GIVES FALSE???)
    println("Nothing is a superclass of String: ${Nothing::class.isSuperclassOf(String::class)}")
    println("Nothing is a subclass of String: ${Nothing::class.isSubclassOf(String::class)}")
    println("Nothing is a subclass of Any: ${Nothing::class.isSubclassOf(Any::class)}")

    // Unit example
    println("\nUnit example")
    // Unit is a singleton and is used in place of void in Kotlin. Unlike in Java, where a function returns nothing
    // when its returning type is void, in Kotlin it is actually returning the singleton Unit instance.
    fun noop(): Unit {}
    val result = noop()
    println("Unit is a superclass of String:  ${Unit::class.isSuperclassOf(String::class)}")
    println("Unit is a subclass of String:  ${Unit::class.isSubclassOf(String::class)}")
    println("The value returned by noop is of class: ${result::class.simpleName}")
    println("result is referentially equivalent to Unit: ${result === Unit}")

}