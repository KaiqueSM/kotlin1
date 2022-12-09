package com.example.section5.interfaces

interface Vehicle {

    val autoMakerName: String

    fun start(){
        println("VRUUUUUUUUUUUUUUUUUUM")
    }

    fun stop(){
        println("Break noise!")
    }

    fun getKmPerLiter():Int{
        return 17
    }

    fun getDoors():Int
}