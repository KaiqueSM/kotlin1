package com.example.section4

fun main() {
    println(myFunction(2,3))
    println(myExpressionFunction(2,3))
    println(myExpressionFunctionInference(2,3))
    println(myFunctionWithDefaults())
    println(myFunctionWithDefaults(message = "Teste"))
    println(myFunctionWithDefaults(10,message = "Teste"))
}

/*
    Sintaxe:
    fun nomeDoMetodo(parametro : tipo) : tipo do retorno{}
 */
fun myFunction(num1: Int, num2: Int) :Int{
    return num1+num2
}
// a mesma função
fun myExpressionFunction(num1: Int, num2: Int) :Int = num1+num2
fun myExpressionFunctionInference(num1: Int, num2: Int) = num1+num2
fun myFunctionWithDefaults(num1: Int = 1, num2: Int = 5, message:String = "Default") :Int {
    println(message)
    return num1+num2
}