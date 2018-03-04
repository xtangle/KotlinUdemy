package com.academy.learnprog.declarations

typealias SomeInt = Int

fun main(args: Array<String>) {
    // Value/variable declarations
    var number: Int
    number = 10
    number = 20

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"

    val employee2: Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("Jane Smith", 400)
    } else {
        employee2 = Employee("Mike Watson", 150)
    }

    val number3: SomeInt = 50

    val names = arrayListOf("John", "Jane", "Mary", 1)
    println(names)

    println("\nDone")
}

class Employee(var name: String, val id: Int) {
}