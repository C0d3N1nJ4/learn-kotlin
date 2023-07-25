package com.example.learnkotlin.controlflow

fun main() {

    val myInt = 199
    val anInt:Int = 1

    val lowest = if (myInt < anInt) myInt else anInt
    println("The lowest value is $lowest")

    val temp = 80
    val isAirConditionerOn = if (temp>= 80) {
        println("It is warm")
        true
    } else {
        println("It is not warm")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")
}