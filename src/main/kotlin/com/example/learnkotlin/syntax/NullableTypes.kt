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

    //assert that a var is not null
    var n = Person(firstName = "Ewald", middleName = null, lastName = "Kok")
    if (n.middleName != null) {
        //possible but don't do this - use safe call operator instead
        val middleNameLength = n.middleName!!.length
    }

    //safe call operator
    var m = Person(firstName = "Ewald", middleName = null, lastName = "Kok")
    val middleNameLength = m.middleName?.length

    //safe call operator with Elvis
    var o = Person(firstName = "Ewald", middleName = null, lastName = "Kok")
    val middleNameLength2 = o.middleName?.length ?: 0

}

