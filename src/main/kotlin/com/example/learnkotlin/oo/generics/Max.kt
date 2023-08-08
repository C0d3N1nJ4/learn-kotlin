package com.example.learnkotlin.oo.generics

//This function compares two values and returns the greater of the two using the compareTo() method in a generic function
fun <T: Comparable<T>> max(param1: T, param2: T): T {
    val results = param1.compareTo(param2)
    return if (param1 > param2) param1 else param2
}
