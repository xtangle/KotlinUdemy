package com.academy.learnprog.section3

fun main(args: Array<String>) {

    // Equality examples
    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)

    // Structural equality
    println("\nStructural equality test")
    println(employeeOne == employeeTwo) // false
    println(employeeTwo == employeeThree) // true
    println(employeeOne.equals(employeeTwo)) // false
    println(employeeTwo.equals(employeeThree)) // true

    // Referential equality
    println("\nReferential equality test")
    println(employeeOne === employeeTwo) // false
    println(employeeTwo === employeeThree) // false
    val employeeFour = employeeTwo
    println(employeeFour === employeeTwo) // true

    // More equality tests
    println("\nMore equality tests")
    println(employeeFour != employeeTwo) // false
    println(employeeFour !== employeeTwo) // false
    println(employeeTwo != employeeThree) // false
    println(employeeTwo !== employeeThree) // true

}