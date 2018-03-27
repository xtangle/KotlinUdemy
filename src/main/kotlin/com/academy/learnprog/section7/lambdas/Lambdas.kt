package com.academy.learnprog.section7.lambdas

fun main(args: Array<String>) {
    run { println("I'm in a lambda!") }
    println()

    val employees = listOf(
        Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002)
    )

    // Print the longest serving employee
    println(employees.minBy { it.startYear })
    // Or, we can use a member reference:
    println(employees.minBy(Employee::startYear))
    println()

    // Lambdas can access local variables as long as they're declared before the lambda
    // This is different from Java where you can only access final local variables within lambdas
    var num = 10
    run {
        num += 15
        println(num)
    }
    println()

    // Using method reference for top-level function
    run(::topLevel)
}

fun topLevel() = println("I'm in a function!")

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)