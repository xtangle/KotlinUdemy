package com.academy.learnprog.section7.generics.contravariance

fun main(args: Array<String>) {

    val flowerTender = object: FlowerCare<Flower> {
        override fun prune(flower: Flower) = println("I'm tending a ${flower.name}!")
        // override fun pick(): Flower = Flower("some random flower")
    }

    /*
    val roseTender = object: FlowerCare<Rose> {
        override fun prune(flower: Rose) = println("I'm pruning a rose!")
    }
    */
    val roseGarden: Garden<Rose> = Garden(listOf(Rose(), Rose()), flowerTender)
    roseGarden.tendFlower(0)

    /*
    val daffodilTender = object: FlowerCare<Daffodil> {
        override fun prune(flower: Daffodil) = println("I'm pruning a daffodil!")
    }
    */
    val daffodilGarden: Garden<Daffodil> = Garden(listOf(Daffodil(), Daffodil(), Daffodil()), flowerTender)
    daffodilGarden.tendFlower(2)
}

open class Flower(val name: String)
class Rose: Flower("Rose")
class Daffodil: Flower("Daffodil")

/**
 * Contravariance
 * Here, T is in the 'in' position,
 * meaning it can only appear as types in function arguments and not as a return type.
 */
interface FlowerCare<in T> {
    fun prune(flower: T)
    // fun pick(): T
}

class Garden<T: Flower>(val flowers: List<T>,
                        val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int) = flowers[i]
    fun tendFlower(i: Int) = flowerCare.prune(flowers[i])
}