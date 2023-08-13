package com.example.learnkotlin.syntax

fun main() {
    val myInt = 10
    val myLong = myInt.toLong()
    val myString = myLong.toString()
    val myIntAgain = myString.toInt()
    println("myInt: $myInt")
    println("myLong: $myLong")
    println("myString: $myString")
    println("myIntAgain: $myIntAgain")
}