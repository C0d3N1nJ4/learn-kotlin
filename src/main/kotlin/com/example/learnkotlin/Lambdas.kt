package com.example.learnkotlin

data class Student(val name: String, var age: Int)

fun getStudents() : List<Student> {
    return listOf(
        Student("John", 20),
        Student("Jane", 23),
        Student("Mary", 25),
        Student("Mark", 19),
        Student("Peter", 21),
        Student("Paul", 22),
        Student("Betty", 24),
        Student("Bob", 18)
    )
}

fun main(args: Array<String>) {
    val students = getStudents()
    val combos = students.map{a -> a.name + ":" + a.age}
    println("Combos : " + combos)

    println("The oldest studet is : " + students.maxBy{it.age})
}
