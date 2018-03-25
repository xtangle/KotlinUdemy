package com.academy.learnprog.section5

fun main(args: Array<String>) {
    Department.values().forEach { println(it.getDeptInfo()) }
}

enum class Department(private val fullName: String, private val numEmployees: Int) {
    HR("Human Resources", 5),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3),
    SALES("Sales", 20);

    // ^- When there is a function, need a semi-colon after the last Enum value
    fun getDeptInfo() = "The $fullName department has $numEmployees employees"
}