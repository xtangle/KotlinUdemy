package com.academy.learnprog.section5

import com.academy.learnprog.section5.anotherpackage.functionFromAnotherPackage
import com.academy.learnprog.section5.anotherpackage.toUpperMiddle
import org.apache.commons.lang3.BitField
import org.apache.commons.lang3.arch.Processor.Arch.*
import org.apache.commons.lang3.RandomStringUtils as RandStr

fun main(args: Array<String>) {

    functionFromAnotherPackage("Hello from Imports")

    // We use Apache commons lang 3 as example of importing from another module
    println(BitField(12345))

    // Example of importing a function extension
    println("Hello me".toUpperMiddle())

    // Example of importing all Enums. Note the wildcard (*) in the import
    println("Types of Arch are: $BIT_32, $BIT_64, $UNKNOWN")

    // Import alias example. Note the 'as' in the import statement
    println(RandStr.random(10))
}