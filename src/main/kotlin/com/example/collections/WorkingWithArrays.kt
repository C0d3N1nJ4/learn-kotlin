package com.example.collections
class WorkingWithArrays {

    fun arrayExamples() {

        //Using the arrayOf factory method to create an array
        val strings = arrayOf("spring", "summer", "fall", "winter")

        //Create an array of nulls
        val nullStringArray = arrayOfNulls<String>(5)

        //Array of strings containing the squares of 0 to 4
        val squares = Array(5) { i -> (i * i).toString() }
    }
}