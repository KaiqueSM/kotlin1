package com.example.section8.closures

fun closureMaker(): () -> Unit{
    var num = 0
    return { println(num++) }
}

fun main() {

    val count1 = closureMaker()
    val count2 = closureMaker()

    count1()
    count1()
    count1()
    count2()
    count2()
    count1()
}
