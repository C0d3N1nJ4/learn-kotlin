package com.example.learnkotlin.oo.objects

object MySingleton {
    var temperature = arrayOf(45,19, 32, 10)
    fun getLastTemperature() = temperature.last()
}
fun main() {

    val location = object {
        var xPosition = 200
        var yPosition = 400
        fun printLocation() {
            println("Object location is at $xPosition, $yPosition")
        }
    }
    println("Object location is at ${location.xPosition}, ${location.yPosition}")

    location.printLocation()

    //change the values of xPosition and yPosition
    location.xPosition = 300
    location.yPosition = 500
    location.printLocation()

    println("Last temperature is ${MySingleton.getLastTemperature()}")
}