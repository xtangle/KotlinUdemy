package com.academy.learnprog.section4

fun main(args: Array<String>) {

    val str: String? = "This isn't null"

    /**
     * (!!) Non-null assertion
     * Only use it if we are absolutely sure it is not null
     * If it does happen to be null, a KotlinNullPointerException will be thrown!
     */
    //val str2 = str!!.toUpperCase()

    /*
    val str3: String? = null
    val str4 = str3!!
    val str5 = str4.toUpperCase()
    */
    /** The exception is thrown on line 13! It occurs at where we make the assertion,
     * not where we call the toUpperCase. The runtime checks whether the assertion
     * is true, and if it doesn't, it throws an exception.
     */

    /**
     * The 'let' function, shorthand for:
     * if (str != null) {
     *     printText(str)
     * }
     */
    str?.let { printText(it) }

    val str6: String? = null
    val anotherStr = "This isn't nullable"
    // No error here even though it calls .equals method
    // The 'equals' operator is 'safe'
    println(str6 == anotherStr)
}

fun printText(text: String) {
    println(text)
}