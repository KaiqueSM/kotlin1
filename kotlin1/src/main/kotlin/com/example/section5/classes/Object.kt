package com.example.section5.classes

fun main(){
    val location1 = object{
        var xCord = 200
        var yCord = 300
    }

    println("Cordinates: (${location1.xCord}, ${location1.yCord})")

    val location2 = object{
        var xCord = 400
        var yCord = 500
        fun printIt(){
            println("Cordinates: (${xCord}, ${yCord})")
        }
    }

    location2.printIt()
    location2.xCord = 100
    location2.printIt()

    val temperature = MySingleton.getLast()
    println(temperature)
}


object MySingleton{
    var temperatures = arrayOf(17,22,28)

    fun getLast() = temperatures.last()
}
