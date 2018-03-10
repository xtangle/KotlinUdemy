package com.academy.learnprog.section4

fun main(args: Array<String>) {
    // Null References example
    println("Null References example")
    println()

    val str: String? = "This isn't null"
    // str.toUpperCase() // <- error!

    /**
     * The 'Safe Call' operator (?.)
     * The below is equivalent to:
     *
     * if (str != null) {
     *     println(str.toUpperCase())
     * } else {
     *     println(str)
     * }
     */
    println(str?.toUpperCase())

    // What happens if it's null?
    val str2: String? = null
    println("What happens when we do this: ${str2?.toUpperCase()}")


    /**
     * Imagine in Java you had to do the following:
     *
     * if (bankBranch != null) {
     *     Address address = bankBranch.getAddress();
     *     if (address != null) {
     *         Country country = address.getCountry();
     *         if (country != null) {
     *             String countryCode = country.getCountryCode();
     *         }
     *     }
     * }
     *
     * In Kotlin we can write this in one line of code:
     *
     * val countryCode: String? = bankBranch?.address?.country?.countryCode
     *
     * The 'Elvis' operator (?:)
     * By using this operator we can also assign a default country code:
     *
     * val countryCode: String = bankBranch?.address?.country?.countryCode ?: "CAN"
     */

    val str3: String = str2 ?: "This is the default value"
    println("The value of str3 is: $str3")

    /**
     * The 'Safe cast' (as?) operator
     * If cast is unsuccessful, return null
     */
    val something: Any = arrayOf(1, 2, 3, 4)
    val str4: String? = something as? String // Cannot cast Array to String, returns null
    println(str4?.toUpperCase())
}