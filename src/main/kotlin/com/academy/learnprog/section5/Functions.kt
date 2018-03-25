package com.academy.learnprog.section5

fun main(args: Array<String>) {
    println(labelMultiply(3, 4))
    // Calling with "named arguments"
    println(labelMultiply(label = "The answer is:", operand2 = 3, operand1 = 4))
    println()

    val emp = Employee2("Jane")
    println(emp.upperCaseFirstName())
    println()

    // Using varargs
    val car1 = Car("blue", "Toyota", 2015)
    val car2 = Car("red", "Ford", 2016)
    val car3 = Car("grey", "Ford", 2017)
    printColors(car1, car2, car3, label = "Color is:")
    println()

    val manyCars = arrayOf(car1, car2, car3)
    printColors(*manyCars) // The spread operator
    println()

    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)
    lotsOfCars.forEach { println(it) }
}


/* Function with a "block body"
fun labelMultiply(operand1: Int, operand2: Int, label: String): String {
    return "$label ${operand1 * operand2}"
}
*/

// Equivalent function with an "expression body"
inline fun labelMultiply(operand1: Int, operand2: Int,
                  label: String = "The result of $operand1*$operand2 is:") =
        "$label ${operand1 * operand2}"

fun whatever() = 3 * 4

class Employee2(val firstName: String) {

    fun upperCaseFirstName() = firstName.toUpperCase()
}

// We can only have 1 vararg parameter in a function signature
fun printColors(vararg cars: Car, label: String = "Color:") {
    for (car in cars) {
        println("$label ${car.color}")
    }
}