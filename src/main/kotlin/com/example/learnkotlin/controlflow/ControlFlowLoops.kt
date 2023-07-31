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

    //advanced loops with index and step function
    var ndx = 0
    for (item in 10.rangeTo(20).step(2)) {
        println("${++ndx}) - $item")

    }
    println()

    //advanced loops with index and step function
    for ((index, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("${index + 1}) - $item")
    }

    //advanced loops
    val myArray = arrayOf("a", "b", "c", "d", "e")
    for (item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }
    println()

}

