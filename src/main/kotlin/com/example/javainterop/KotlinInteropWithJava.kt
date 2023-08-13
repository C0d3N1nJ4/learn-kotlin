package com.example.javainterop

fun javaInterop() {
    val Frisky = Animal("Frisky", "Dog", 4 )
    println(Frisky.show())
    val Fido = Animal("Fido", "Cat", 7)
    println(Fido.show())

    Frisky.type = "Cat"
    println(Frisky.show())
}

fun main(args: Array<String>) {
    javaInterop()

}