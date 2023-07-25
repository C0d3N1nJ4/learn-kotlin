package com.example.learnkotlin.controlflow

fun main() {

    var x = 2

    println("Test while loop")

    while (x <= 10) {
        println("x = $x")
        x += 3
    }

    println("Test do while loop")

    do {
        println("x = $x")
        x -= 3
    } while (x > 0)

    println("Test for loop")

    for (item in 1..10) {
        print("$item, ")
    }

    println()
    println("Test for loop with string")

    for (ch in "biscuit") {
        println(ch)
    }
}
