package com.academy.learnprog.section5

fun main(args: Array<String>) {

    val emp = Employee("John")
    println(emp.firstName)
    emp.fullTime = false
    println(emp.fullTime)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee(fullTime = false, firstName = "Jane")
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)
}

/*
class Employee constructor(firstName: String) {
    val firstName: String
    init {
        this.firstName = firstName
    }
}
*/

/*
class Employee constructor(firstName: String) {
    val firstName: String = firstName
}
*/

/*
class Employee(val firstName: String) {
    var fullTime: Boolean = true

    constructor(firstName: String, fullTime: Boolean): this(firstName) {
        this.fullTime = fullTime
    }
}
*/

class Employee(val firstName: String, fullTime: Boolean = true) {

    var fullTime = fullTime
    get() {
        println("Running the custom get")
        return field
    }
    set(value) {
        println("Running the custom set")
        field = value
    }


}

// You can have a secondary constructor even without a primary constructor
class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}