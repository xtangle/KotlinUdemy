package com.academy.learnprog.section5

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()
    println(laserPrinter.bestSellingPrice())
    println()

    SomethingElse("whatever")
}

abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName) {
    // Note: override also means open. To prevent it from being overridden, use the keyword 'final'
    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 129.99
}

class SpecialLaserPrinter(modelName: String): LaserPrinter(modelName, 100)

open class Something {
    val someProperty: String
    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }
}

class SomethingElse: Something {
    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("I'm in the child's constructor")
    }
}

/**
 * Data classes cannot be extended (as of Kotlin 1.2)
 * however, they can extend other open classes
 */
// open data class DataClass(val number: Int)