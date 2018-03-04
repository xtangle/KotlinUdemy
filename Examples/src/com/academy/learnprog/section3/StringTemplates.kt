package com.academy.learnprog.section3

fun main(args: Array<String>) {
    println("String templates")
    val employee1 = Employee("Lynn Smith", 500)
    println(employee1)

    // String templates
    println("\nString templates")
    val change = 4.22
    println("To print the value of change, use \$change")
    println("Your change is $$change")

    println("\nExpressions in string templates")
    val numerator = 10.99
    val denominator = 0.00
    @Suppress("DIVISION_BY_ZERO")
    println("The value of $numerator divided by $denominator is ${numerator / denominator}")
    println("The employee's id is ${employee1.id}")
}