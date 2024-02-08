package com.example.service

import kotlin.test.Test
import kotlin.test.assertEquals

class CircleClass {
    @Test
    fun `test circle area calculation`() {
        val circle = Circle(10.0)
        val expectedArea = 314.0
        assertEquals(expectedArea, circle.area(), "The area of the circle is incorrect")
    }

    @Test
    fun `test circle perimeter calculation`() {
        val circle = Circle(10.0)
        val expectedPerimeter = 62.8
        assertEquals(expectedPerimeter, circle.perimeter(), "The perimeter of the circle is incorrect")
    }
}
