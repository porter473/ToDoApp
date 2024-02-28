package com.example.service

import kotlin.test.Test
import kotlin.test.assertEquals

class SquareTest{
    @Test
    fun `test square area calculation`() {
        val square = Square(10.0)
        val expectedArea = 100.0
        assertEquals(expectedArea, square.area(), "The area of the square is incorrect")
    }

    @Test
    fun `test square perimeter calculation`() {
        val square = Square(10.0)
        val expectedPerimeter = 40.0
        assertEquals(expectedPerimeter, square.perimeter(), "The area of the square is incorrect")
    }
}
