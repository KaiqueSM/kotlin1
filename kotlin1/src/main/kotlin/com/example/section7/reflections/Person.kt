package com.example.section7.reflections

class Person internal constructor(firstName: String, lastName: String) {
    init {
        println("Create a person named $firstName $lastName")
    }

    constructor (firstName: String, middleName: String, lastName: String): this(firstName, lastName){
        println(middleName)
    }
}