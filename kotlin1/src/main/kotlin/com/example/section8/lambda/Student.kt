package com.example.section8.lambda

data class Student(val name: String, var age: Int)

fun getStudents():List<Student>{
    return listOf(
        Student("Adonias",21),
        Student("Breno",22),
        Student("Celia",23),
        Student("Diego",24),
        Student("Eduardo",25),
        Student("Flavio",26),
        Student("Gabi",27)
    )
}
