package com.example.section8.memorization

import org.funktionale.memoization.memoize

fun main() {

    var fibonacci: (Long) -> Long = {it}

    fibonacci = {n:Long ->
        if (n < 2) n else fibonacci(n-1)+fibonacci(n -2)
    }


    var memo: (Long) -> Long = {it}

    memo = {n:Long ->
        if (n < 2) n else memo(n-1)+memo(n -2)
    }.memoize()

    println("Fibonacci: ${timeElapsed {fibonacci(45)}}ms")
    println("Fibonacci with memoize: ${timeElapsed {memo(45)}}ms")
}

fun timeElapsed(body:() -> Unit):Long{

    val start = System.currentTimeMillis()
    body()
    val end = System.currentTimeMillis()
    return end-start
}