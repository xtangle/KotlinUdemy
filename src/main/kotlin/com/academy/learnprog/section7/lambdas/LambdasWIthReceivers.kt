package com.academy.learnprog.section7.lambdas

fun main(args: Array<String>) {

    val employees = listOf(
        Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002)
    )

    println(countTo100())
    println()

    findByLastName(employees, "Wilson")
    findByLastName(employees, "Smithson")
    println()

    "Some String".apply someString@{
        "Another String".apply {
            //println(toLowerCase()) // Applies to "Another String"
            println(this@someString.toUpperCase()) // Applies to "Some String"
        }
    }
}

/*
fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}
*/

// 'with' pass the instance into the receiver object in the lambda
/*
fun countTo100() =
    with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }
*/

// 'apply' uses the instance and apply the lambda on it
fun countTo100() =
    StringBuilder().apply {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
    }.toString()

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@{
        if (it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName")
            // return // Returns from both the lambda and the function, a 'non-local return'
            return@returnBlock // Returns from only the lambda, a 'local return'
        }
    }
    println("Nope, there's no employee with the last name $lastName")
}