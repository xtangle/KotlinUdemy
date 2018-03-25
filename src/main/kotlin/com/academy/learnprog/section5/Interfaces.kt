package com.academy.learnprog.section5

fun main(args: Array<String>) {
    val something = SomeClass()
    println(something.number)
    println(something.number2)
}

// Interfaces are open by default
interface MyInterface {
    val number: Int // Abstract property
    val number2: Int // Concrete property, but property initializers are not allowed
    get() = number * 100
    fun myFunction(str: String): String
}

interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int): String
}

class SomeClass: MySubInterface {
    override val number: Int = 25

    override fun myFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mySubFunction(num: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}