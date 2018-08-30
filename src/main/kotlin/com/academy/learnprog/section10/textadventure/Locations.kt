package com.academy.learnprog.section10.textadventure

fun readLocationInfo() : Map<Int, Location> {

    val locations = mutableMapOf<Int, Location>()

    ClassLoader.getSystemClassLoader().getResourceAsStream("locations_big.txt").bufferedReader().forEachLine {
        val tokens = it.split("`")

        val location = Location(tokens[0].toInt(), tokens[1])
        locations[location.locationID] = location
    }

    ClassLoader.getSystemClassLoader().getResourceAsStream("directions_big.txt").bufferedReader().forEachLine {
        val tokens = it.split(",")

        locations[tokens[0].toInt()]?.addExit(tokens[1], tokens[2].toInt())
    }

    return locations

}