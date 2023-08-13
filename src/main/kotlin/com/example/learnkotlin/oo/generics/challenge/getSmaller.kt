package com.example.learnkotlin.oo.generics.challenge

fun <T: Comparable<T>> getSmaller(param1: T, param2: T): T {
    val results = param1.compareTo(param2)
    return if (param1 < param2) param1 else param2
}

fun main(args: Array<String>) {
    println("Get Smaller Challenge")

    //Please add the getSmaller function above the main function

    val minInt: Int = getSmaller(42, 99)
    val minDouble: Double = getSmaller(42.0, 32.0)
    val minString: String = getSmaller("Kitten", "kittens")

    println("minInt = $minInt")
    println("minDouble = $minDouble")
    println("minString = $minString")

}