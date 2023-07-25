package com.example.learnkotlin.syntax


    //fun declares a new function
//main is where the program starts

    val topLevelVal = "top level val"
    fun main() {
        println("Hello World!")
        //read-only variable
        val name = "Kotlin"
        println("Hello $name!")
        //mutable variable
        var surname = "Practice"
        println("Hello $name $surname!")
        //print top level val
        println(topLevelVal)

        val customers = 10
        println("There are $customers customers")
        println("There are ${customers + 1} customers")

        // Variable declared without initialization
        val d: Int

        // Variable initialized
        d = 3

        // Variable explicitly typed and initialized
        val e: String = "hello"

        // Variables can be read because they have been initialized
        println(d) // 3
        println(e) // hello

        // Read only list
        val readOnlyShapes = listOf("triangle", "square", "circle")
        println(readOnlyShapes)
        // Mutable list with explicit type declaration
        val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
        println(shapes)
    }


