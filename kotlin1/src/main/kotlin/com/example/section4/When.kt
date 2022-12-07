package com.example.section4

fun main() {
    // uso do when
    val pizzasOrdered = 1

    when(pizzasOrdered){
        0 -> println("Not hungry")
        1, 2 -> println("Hungry")
        in 3..8 -> println("Very Hungry")
        9 -> println("Very Very Hungry")
        else -> {
            println("Are you sure")
        }
    }

    when(pizzasOrdered){
        Math.abs(pizzasOrdered) -> println("0 or more pizzar")
        else -> println("Ordered last then 0")
    }

    when{
        pizzasOrdered <= 0 -> println("None ordered")
        pizzasOrdered %2 ==0 -> println("Odd number ordered")
        pizzasOrdered %2 ==1 -> println("Even number ordered")
    }


}