package com.example.service

class Circle(private val radius: Double) {
    private val PI = 3.14

    fun area(): Double = PI * radius * radius

    fun perimeter(): Double = 2 * PI * radius
}
