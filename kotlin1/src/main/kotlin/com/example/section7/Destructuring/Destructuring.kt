package com.example.section7.Destructuring

import com.example.section7.operators.Cordinates

fun main() {
    val cordinates1 = Cordinates(100,200)
    val cordinates2 = Cordinates(200,100)
    val cordinates3 = cordinates1+cordinates2

    println(cordinates3)

    val (xCord, yCord) = cordinates3

    println("xcord: $xCord, ycord $yCord")
    println("xcord: ${cordinates3.component1()}, ycord ${cordinates3.component2()}")

    showComponent()
}

fun showComponent(){
    val myPoint = Point(10,20,30)

    val (x,y,z) = myPoint
    println("X: $x, Y: $y, Z: $z")
}
