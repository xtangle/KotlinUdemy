package com.academy.learnprog.challenges

fun main(args: Array<String>) {

    // using a range, print 5, 10, 15, 20, 25... 5000, each number
    // on a separate line
    if (false) {
        for (i in 5..5000 step 5) {
            println(i)
        }
        println()
    }

    // using a range, -500..0, each number on a separate line
    if (false) {
        (-500..0).forEach { println(it) }
        println()
    }

    // using a range, print the first 15 numbers in the
    // Fibonacci sequence, each
    // number on a separate line
    // Hint: you'll have to print the first one or two numbers
    // outside the range
    // 0, 1, 1, 2, 3, 5, 8...
    if (false) {
        val fibNum = arrayListOf(0, 1)
        for (i in 2 until 15) {
            fibNum.add(fibNum[i - 2] + fibNum[i - 1])
        }
        fibNum.forEachIndexed { index, value -> println("The ${index + 1} Fibonacchi number is $value") }
        println()
    }

    // Modify the following code so that it prints the following,
    // each number on a separate line
    // 1, 11, 100, 99, 98, 2
    if (false) {
        iLoop@ for (i in 1..5) {
            println(i)
            if (i == 2) {
                break
            }
            for (j in 11..20) {
                println(j)
                for (k in 100 downTo 90) {
                    println(k)
                    if (k == 98) {
                        continue@iLoop
                    }
                }
            }
        }
        println()
    }

    if (true) {
        // Declare a variable called num (int) and assign it whatever you want
        val num = 69

        // Declare a variable called dnum (double) and assign it as follows:
        // if num > 100, assign dnum -234.567
        // if num < 100, assign dnum 4444.555
        // if num == 100, assign dnum 0.0
        // do all of the above (declaring dnum and assigning
        // it) in one statement/expression
        val dnum = when {
            num > 100 -> -234.567
            num < 100 -> 4444.555
            else -> 0.0 // num == 100
        }

        // Then print the value of dnum - separate statement
        println(dnum)
        println()
    }
}