package com.example.learnkotlin.oo.interfaces

class Car() : Vehicle {

    override val makeName = "Ford"

    override fun getDoors(): Int {
        return 4
    }

}