package com.example.section8.sequencies

fun main() {
    var students = getStudents()

    var sqStudents = students.drop(1).take(3).toList()
    println("Sequenci alterada: $sqStudents")

    val numbers = generateSequence(100){it+1}

    println("Numbers sequence: ${numbers.drop(5).take(10).toList()}")

    val squares = generateSequence (1) { it+1 } .map { it*it }
    val evenSquares = squares.filter { it %2 == 0 }
    println(evenSquares.take(5).toList())

    val fibonacci = generateSequence(1 to 1)
        { it.second to it.first + it.second }
            .map{ it.first }

    println("Fibonacci ${fibonacci.take(15).toList()}")
}