package com.example.section7.Destructuring

class Point(
    var x: Int,
    var y: Int,
    var z: Int
) {

    operator fun component1()= x
    operator fun component2()= y
    operator fun component3()= z
}