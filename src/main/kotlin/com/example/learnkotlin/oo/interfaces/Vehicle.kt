package com.example.learnkotlin.oo.interfaces

interface Vehicle {

    val makeName: String

    fun go() {
        println("The $makeName is going")
    }

    fun stop() {
        println("The $makeName is stopping")
    }

    fun getMileage(): Int {
        return 100
    }

    fun getDoors(): Int

}