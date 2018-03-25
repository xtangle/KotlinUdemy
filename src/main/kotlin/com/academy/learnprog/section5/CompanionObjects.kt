package com.academy.learnprog.section5

fun main(args: Array<String>) {
    println(SomeClass2.accessPrivateVar())
    println()
    // println(SomeClass2.Companion.accessPrivateVar()) // Don't have to include the Companion name

    val someClass1 = SomeClass2.justAssign("this is the string as is")
    val someClass2 = SomeClass2.upperOrLowerCase("this isn't the string as is", false)
    println(someClass1.someString)
    println(someClass2.someString)
}

class SomeClass2 private constructor (val someString: String) {
    /**
     * Grouping of static members inside companion objects,
     * can access them without an instance of SomeClass2
     */
    companion object {
        private const val privateVar = 6

        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"

        // Companion objects are Useful for containing factory functions
        fun justAssign(str: String) = SomeClass2(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass2 {
            return if (lowerCase) {
                SomeClass2(str.toLowerCase())
            } else {
                SomeClass2(str.toUpperCase())
            }
        }
    }
}
