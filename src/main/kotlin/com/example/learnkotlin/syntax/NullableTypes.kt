package com.example.learnkotlin.syntax

fun declareNonNullableVariable() {

    var name: String
    name = "Naiomi"
    println("$name")
}

fun declareNullableVariable() {

    var name: String?
    name = null
    println("$name")
}

class Person(val firstName: String,
             val middleName: String?,
             val lastName: String)

fun main() {
    declareNonNullableVariable()
    declareNullableVariable()

    val person = Person("John", null, "Doe")
    println("${person.firstName} ${person.middleName} ${person.lastName}")

    //check nullability of val --> smart cast to non-null String
    val p = Person(firstName = "Naiomi", middleName = null, lastName = "Naidoo")
    if (p.middleName != null) {
        val middleNameLength = p.middleName.length
    }
}