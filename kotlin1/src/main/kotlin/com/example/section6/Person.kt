package com.example.section6

//class Person constructor(firstName: String, lastName: String) {
class Person internal constructor(var firstName: String, var lastName: String) {
    init {
        println("Create a person named $firstName $lastName")
    }

    constructor (firstName: String, middleName: String, lastName: String): this(firstName, lastName){
        println("Complete name:  $firstName $middleName $lastName")
    }
}