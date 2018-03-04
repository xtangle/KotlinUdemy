package com.academy.learnprog.helloworld

fun main(args: Array<String>) {
    area(height = 20, width = 10)
}

fun area(width: Int, height: Int) {
    println("width = $width and height = $height")
    println("the com.academy.learnprogramming.helloworld.area is ${width * height}")
}