package com.example.section8.funktionale

import org.funktionale.currying.curried

fun main() {

    val sum3ints = {a:Int ,b:Int ,c:Int  -> a+b+c}
    val curried : (Int) -> (Int) -> (Int) -> Int = sum3ints.curried()

    val curriedResult = curried(2)(4)(6)

    println("Result: $curriedResult")
}