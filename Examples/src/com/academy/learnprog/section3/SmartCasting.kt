package com.academy.learnprog.section3

fun main(args: Array<String>) {
    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)

    // Type checking and smart casting
    println("\nType checking and smart casting")
    var something: Any = employeeTwo
    if (something is Employee) {
        // Inside this if block, something is already cast to Employee (smart casting)
        var newEmployee = something as Employee // No cast is needed
        println("something is an Employee")
        println(newEmployee.name)
    }
    if (something !is Employee) {
        println("something is not an Employee")
    }
    if (something is Employee) {
        something = "hello"
        // println(something.name) // doesn't work, something is a String
        something = employeeOne
        println(something.name) // now works, something is an Employee again
    }
}