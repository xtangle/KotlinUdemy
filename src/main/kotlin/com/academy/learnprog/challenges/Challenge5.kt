package com.academy.learnprog.challenges

fun main(args: Array<String>) {

    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val jack = Person("Jack", "Smith", 23)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")

    val persons = listOf(joe, jane, mary, jack, john, jean)
    val lastNameMap = persons.groupBy { it.lastName }
    println(lastNameMap)

    val lastNamesBeginningWithS = persons.count { it.lastName.startsWith('s', true) }
    println("Number of people whose last name begins with 's': $lastNamesBeginningWithS")

    val namePairs = persons.map { Pair(it.firstName, it.lastName) }
    println(namePairs)

    // We don't need to use 'also'. Using 'map' with side effects is bad practice!
    persons.forEach { println("${it.firstName} is ${it.age} years old") }

    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)
    val intersection = list1 intersect list2
    println("elements in both lists: $intersection")

    var regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper

    // bad!
    //paper.addPaper(Premium())

    regularPaper = paper // Compiler smart enough to know its regular paper
}


class Person(val firstName: String, val lastName: String, val age: Int) {

    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName', age=$age)"
    }
}


class Box<out T> {

    /*
    fun takePaper(): T {
        Paper()
    }
    */

    /* No no
    fun addPaper(paper: T) {

    }
    */
}

open class Paper {

}

class Regular: Paper() {

}

class Premium: Paper() {

}