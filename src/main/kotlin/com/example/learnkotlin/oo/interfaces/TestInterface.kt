package com.example.learnkotlin.oo.interfaces

fun main() {

    val car = Car()
    car.go()
    car.stop()
    car.getMileage()
    println("The ${car.makeName} has ${car.getDoors()} doors")

}