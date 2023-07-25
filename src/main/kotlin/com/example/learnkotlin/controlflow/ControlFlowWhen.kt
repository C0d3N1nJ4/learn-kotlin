package com.example.learnkotlin.controlflow

fun main(){

    val burgersOrdered = 2

    when (burgersOrdered) {
        0 -> println("Not hungry")
        1, 2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    when (burgersOrdered) {
        Math.abs(burgersOrdered) -> println("Ordered 0 or more burgers")
        else -> println("Ordered less than 0 burgers")
    }

    when (burgersOrdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> println("Not sure")
    }

}