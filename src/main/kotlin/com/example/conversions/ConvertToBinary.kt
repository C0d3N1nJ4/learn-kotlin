package com.example.conversions

//print a number in a base other than base 10
fun main(args: Array<String>) {
val number = 42
    println("The number is $number")
    println("The number in binary is ${number.toString(2)}")

    //binary joke
    val joke = """
        Actually there are ${3.toString(3)} types of people,
        Those who understand binary and those who don't.
        And those who didn't realise this is a ternary joke.
    """.trimIndent()
    println(joke)
}

