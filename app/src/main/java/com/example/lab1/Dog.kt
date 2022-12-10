package com.example.lab1

class Dog: Animal () {
    override fun makeNoise() {
        hunger++
        println("The Dog is howling: Hunger level: $hunger")
    }

    override fun eat() {
        hunger--
        println("The Dog is eating. Hunger level: $hunger")
    }

}