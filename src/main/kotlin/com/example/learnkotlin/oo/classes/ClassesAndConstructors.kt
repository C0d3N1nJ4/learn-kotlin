package com.example.learnkotlin.oo.classes

class Person internal constructor(firstName: String, lastName: String) {
    init {
        println("Created Person with firstName: $firstName and lastName: $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String) : this(firstName, lastName) {
        println("Created Person with firstName: $firstName and lastName: $lastName and middleName: $middleName")
    }

}

fun main() {
    val person = Person("John", "Doe")
    val person2 = Person("Janet", "Reddy", "Lisa")
}

