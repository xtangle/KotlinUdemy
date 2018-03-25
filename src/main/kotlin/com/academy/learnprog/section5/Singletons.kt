package com.academy.learnprog.section5

import java.time.Year

fun main(args: Array<String>) {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
}

/**
 * No need for a constructor. The singleton is created the first time it is used.
 */
object CompanyCommunications {
    val currentYear = Year.now().value
    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."
}