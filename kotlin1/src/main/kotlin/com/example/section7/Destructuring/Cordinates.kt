package com.example.section7.Destructuring

data class Cordinates(
    var xCord: Int,
    var yCord: Int
) {
    operator fun plus(other: Cordinates): Cordinates {
        return Cordinates(xCord + other.xCord, yCord + other.yCord)
    }
}
