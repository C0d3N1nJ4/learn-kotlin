package com.example.learnkotlin.oo.generics

fun main() {

    val maxInt: Int = max(1, 2)
    val maxLong: Long = max(1L, 2L)
    val maxByte: Byte = max((1).toByte(), (2).toByte())
    val maxDouble: Double = max(1.0, 2.0)
    val maxString: String = max("1", "2")

    println("maxInt = $maxInt")
    println("maxLong = $maxLong")
    println("maxByte = $maxByte")
    println("maxDouble = $maxDouble")
    println("maxString = $maxString")

}