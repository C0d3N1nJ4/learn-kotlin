package com.example.learnkotlin

fun ClosureMaker():() -> Unit {
    var counter = 0
    return {
        println("Counter : " + counter++)
    }
}

fun main(args: Array<String>) {
    val closure = ClosureMaker()
    closure()
    closure()
    closure()
    closure()
    closure()
}
