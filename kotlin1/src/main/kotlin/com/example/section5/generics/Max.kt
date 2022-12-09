package com.example.section5.generics

fun <T : Comparable<T>> max(param1:T, param2:T) :T {
    var result = param1.compareTo(param2)
    return if (result > 0) param1 else param2
}