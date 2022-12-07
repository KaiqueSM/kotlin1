package com.example.section4

fun main() {
    println(fizzBuzz())
    println(fizzBuzzWithForEach())
}

fun fizzBuzz(numMax: Int = 15): List<String>{
    var list = ArrayList<String>()

    for (num in 1..numMax){
        val item = when{
            num %3 == 0 && num %5 ==0 -> "fizzBuzz"
            num %3 == 0 -> "fizz"
            num %5 ==0 -> "buzz"
            else -> "$num"
        }
        list.add(item)
    }

    return list
}

fun fizzBuzzWithForEach(numMax: Int = 15): List<String>{
    var list = ArrayList<String>()

     (1..numMax).forEach{
        val item = when{
            it %3 == 0 && it %5 ==0 -> "fizzBuzz"
            it %3 == 0 -> "fizz"
            it %5 ==0 -> "buzz"
            else -> "$it"
        }
        list.add(item)
    }

    return list
}