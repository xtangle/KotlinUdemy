package com.academy.learnprog.challenges.challenge3

fun main(args: Array<String>) {
    val bike = KotlinBicycle(12, 40, 2)
    val mountainBike = KotlinMountainBike(20, 12, 40, 2)
    val roadBike = KotlinRoadBike(12, 40, 2, 70)
    arrayListOf(bike, mountainBike, roadBike).forEach { it.printDescription() }
    println()

    val bike2 = KotlinBicycle(12, 40)
    val mountainBike2 = KotlinMountainBike(20, 12, 40)
    val roadBike2 = KotlinRoadBike(12, 40, tireWidth = 70)
    arrayListOf(bike2, mountainBike2, roadBike2).forEach { it.printDescription() }
    println()

    val mountainBikeWithColor = KotlinMountainBike("red", 20, 12, 40)
    mountainBikeWithColor.printDescription()
    println()

    KotlinMountainBike.availableColors.forEach { println(it) }
}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() = println("Bike is in gear $gear with a cadence of $cadence " +
            "travelling at a speed of $speed.")
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10)
    : KotlinBicycle(cadence, speed, gear) {

    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10)
            : this(seatHeight, cadence, speed, gear) {
        println("The mountain bike has a color of $color.")
    }

    // companion object. List<String> called availableColors
    // initialize the list to "blue", "red", "white", "black", "green", and "brown"
    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}

class KotlinRoadBike(cadence: Int, speed: Int, gear: Int = 10, val tireWidth: Int)
    : KotlinBicycle(cadence, speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
}