package com.example.lab1

class Bird: Animal () {
    override fun makeNoise() {
        hunger++
        println("The Bird is making a noise. Hunger level: $hunger")
    }

    override fun eat() {
        hunger--
        println("The Bird is eating. Hunger level: $hunger")
    }

}