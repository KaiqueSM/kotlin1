package com.example.section7.reflections

import kotlin.reflect.KClass

fun main() {
    val person = Person("Edson","Arantes")

    val KClass = person::class

    println("Simple name of this class is: ${KClass.simpleName}")

    //for (field in KClass.members){
    for (field in KClass.java.declaredFields){
        //println("Property name: $field")
        println("Property name: ${field.name}")
    }

    for(constructor in KClass.constructors){
        println("Constructor: $constructor")
        println("Constructor Retrn: ${constructor.returnType}")
        println("Constructor Parameters: ${constructor.parameters}")
    }
}