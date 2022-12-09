package com.example.section6

fun main() {
    val cat = Animal("Garfield", "cat", 10)
    println(cat.show())
    cat.weight = 8
    println(cat.show())
    // cat.kind = "horse" // causa erro por ser um final
}