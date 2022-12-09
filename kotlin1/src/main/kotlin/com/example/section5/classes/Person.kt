package com.example.section5.classes

//class Person constructor(firstName: String, lastName: String) {
class Person internal constructor(firstName: String, lastName: String) {
    init {
        println("Create a person named $firstName $lastName")
    }

    constructor (firstName: String, middleName: String, lastName: String): this(firstName, lastName){
        println(middleName)
    }
}