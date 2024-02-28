package com.example.service

class Square(private val side: Double) {

    fun area(): Double = side * side

    fun perimeter(): Double = 4 * side
}
