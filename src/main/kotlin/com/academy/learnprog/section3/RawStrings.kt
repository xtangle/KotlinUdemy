package com.academy.learnprog.section3

fun main(args: Array<String>) {

    // Raw (or triple-quoted) strings
    println("Raw strings\n")

    val filePath = """c:\somedir\somedir"""
    println(filePath)
    println()

    val eggName = "Humpty"
    val nurseryRhyme = """
        *$eggName Dumpty sat on the wall
        *$eggName Dumpty had a great fall
        *All the king's horses and all the king's men
        *Couldn't put $eggName together again.
        """.trimMargin("*") // Trims all whitespace up to and including the margin character
                                        // The default margin character is the | character
    println(nurseryRhyme)
}