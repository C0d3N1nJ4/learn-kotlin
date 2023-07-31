package com.example.learnkotlin.functions

fun myFunction(param1: Int, param2: Int): Int {
    return param1 + param2
}

fun expressionBodyFunction(param1: Int, param2: Int): Int = param1 + param2

fun expressionBodyFunctionWithInferredReturnType(param1: Int, param2: Int) = param1 + param2

fun functionWithDefaultParameters(param1: Int = 10, param2: Int = 20, message: String = "Hello") {
    println("$message, the sum of $param1 and $param2 is ${param1 + param2}")
}
fun main() {
    println("10 + 10 = ${myFunction(10, 10)}")
    println("10 + 20 = ${expressionBodyFunction(10, 20)}")
    println("10 + 30 = ${expressionBodyFunctionWithInferredReturnType(10, 30)}")
    functionWithDefaultParameters()
    functionWithDefaultParameters(1, 2, "Hi")
    functionWithDefaultParameters(1, 2)
    functionWithDefaultParameters(1)
    functionWithDefaultParameters(message = "Greetings")
}