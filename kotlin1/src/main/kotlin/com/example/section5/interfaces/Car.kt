package com.example.section5.interfaces

class Car : Vehicle {

    override val autoMakerName: String = "Honda"

    override fun getDoors() = 4


    var wheels = 1
        set(value) {
            if (value > 0){
                field = value
            }
            else{
                println("Valor invalido")
            }
        }
}

