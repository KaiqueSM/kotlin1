package com.example.section5.generics

fun main() {

    val maxInt: Int = max(20,30)
    val maxLong: Long = max(123_123_123L,234_234_234L)
    val maxByte: Byte = max((-120).toByte(),(120).toByte())
    val maxString: String = max("Alpha","Omega")

    println(maxInt)
    println(maxLong)
    println(maxByte)
    println(maxString)
}