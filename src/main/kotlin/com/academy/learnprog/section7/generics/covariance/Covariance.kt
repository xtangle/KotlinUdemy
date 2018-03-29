package com.academy.learnprog.section7.generics.covariance

fun main(args: Array<String>) {
    /**
     * List<Short> is a sub-type of List<Number> (covariant)
     * MutableList<Short> is not a sub-type of MutableList<Number> (not covariant)
     *
     * List can be covariant because it contains no functions that can change the List
     * MutableList cannot be covariant because it has functions that can modify the list
     */
    val shortList: List<Short> = listOf(1, 2, 3, 4, 5)
    convertNumbersToInt(shortList)
    val mutableShortList: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5)
    // error: Type mismatch. Required: MutableList<Number>, found: MutableList<Short>
    // convertNumbersToInt2(mutableShortList)
}

fun convertNumbersToInt(collection: List<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}

fun convertNumbersToInt2(collection: MutableList<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
    // To illustrate why MutableList is invariant, suppose we call the following:
    //     collection.add(25.3)
    // Now if MutableList were to be covariant, then we can pass in a MutableList<Short>
    // But then we're now adding a Double to a MutableList<Short>, not something we'd like to happen!
}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}

fun waterGarden(garden: Garden<Flower>) {
}

open class Flower
class Rose: Flower()

// class Garden<T: Flower> // This is invariant, i.e. sub-typing is not preserved
class Garden<out T: Flower> { // This is covariant, sub-typing is preserved
    /**
     * Kotlin has the notion of 'in' and 'out' positions.
     * Now that Garden is covariant, we can only use them in an 'out' position.
     * Function arguments are in the 'in' position and function return types are in the 'out' position.
     *
     * A couple of exceptions:
     * - Constructor parameters don't have parameters in 'in' and 'out' positions, because
     *   it is only called when the instance is created. However, we cannot declare a 'var' parameter as covariant,
     *   as Kotlin generates a setter for it and that would violate its property of being in the 'out' position.
     * - Private functions does not have the concept of 'in' and 'out' positions,
     *   because the outside world cannot call them.
     */
    val flowers: List<T> = listOf()
    fun pickFlower(i: Int): T = flowers[i]

    // error: Type parameter T is declared as 'out' but occurs in 'in' position in type T
    // fun plantFlower(flower: T) {}

    // If we're really sure that the function doesn't mutate the Garden
    // we can use the @UnsafeVariance annotation:
    fun flowerExists(flower: @UnsafeVariance T): Boolean = flowers.contains(flower)
}
