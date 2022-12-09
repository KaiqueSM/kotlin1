package com.example.section8.lambda

fun main() {
    val students = getStudents()

    val combos = students.map{
        "${it.name} ${it.age}"
    }

    println(combos)
    println("Oldest: ${students.maxByOrNull{ it.age}}")
    println("Newest: ${students.minByOrNull { it.age }}")
    println("Name with more than 5 characteres: ${students.filter{ it.name.length > 5}}")
    println("Name with the shortest name: ${students.minByOrNull{ it.name.length }}")
}