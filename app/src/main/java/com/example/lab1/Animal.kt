package com.example.lab1

open class Animal {
    open var image = ""
    open var food = ""
    open var habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("The Animal is making a noise")
    }

    open fun eat() {
        println("The Animal is eating")
    }

    open fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }

    fun summary(){
        println("The Animal's habitat is $habitat, it eats $food, and its image is $image")
    }

}