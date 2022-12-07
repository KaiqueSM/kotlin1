package com.example.section4

fun main() {

    // usando for
    for (item in 1..5)
        println(item)

    var index = 0
    for (item in 10.rangeTo(20).step(2)){
        println("${++index}) $item")
    }

    for ((idx, item) in 10.rangeTo(20).step(2).withIndex()){
        println("${idx+1}) $item")
    }

    val array = arrayOf(10,20,30,40)
    for(item in array){
        println("Item $item")
    }
    for(item in array.indices){
        println("Item ${array[item]}")
    }
}