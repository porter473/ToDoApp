package com.example.service

class Rectangle(private val width: Double, private val height: Double) {

    fun area(): Double = width * height

    fun perimeter(): Double = 2 * (width + height)
}
