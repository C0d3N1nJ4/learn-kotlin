package com.example.javainterop

class Person internal constructor(var firstName: String, var lastName: String)  {
    init {
        println("Person created with name $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {}
}