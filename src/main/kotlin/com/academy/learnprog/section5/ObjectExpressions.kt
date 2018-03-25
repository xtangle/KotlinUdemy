package com.academy.learnprog.section5

fun main(args: Array<String>) {

    var thisIsMutable = 45

    /**
     * An example of an "object expression"
     * Note that the object created is NOT a singleton. It is created every time we call
     * the wantsSomeInterface function.
     * The object can implement multiple interfaces and also access outside variables.
     */
    wantsSomeInterface(object : SomeInterface, SomeOtherInterface {
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "This is from mustImplement: ${num * 100}"
        }
    })

    println(thisIsMutable)
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

interface SomeOtherInterface

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface: ${si.mustImplement(22)}")
}