package com.example.learnkotlin.challenge

fun main(args: Array<String>) {
    println("Fizz Buzz Challenge")
    fizzBuzzSolution1()
    println()
    fizzBussSolution2()

}

//Create a loop to display the numbers 1 to 105
//print Fizz if the number is divisible by 3
//print Buzz if the number is divisible by 5
//print Fizz Buzz if the number is divisible by both 3 and 5
//print the number if it is not divisible by 3 or 5
fun fizzBuzzSolution1() {
    for (i in 1..105) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
            println("$i : Fizz Buzz")
        } else if (i % 3 == 0) {
            println("$i : Fizz")
        } else if (i % 5 == 0) {
            println("$i : Buzz")
        } else {
            println(i)
        }


    }
}

fun fizzBussSolution2() {
    for (i in 1..105) {
        when {
            (i % 3 == 0) && (i % 5 == 0) -> println("$i : Fizz Buzz")
            i % 3 == 0 -> println("$i : Fizz")
            i % 5 == 0 -> println("$i : Buzz")
            else -> println(i)
        }
    }
}


