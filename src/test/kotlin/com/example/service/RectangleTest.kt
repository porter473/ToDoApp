package com.example.service

import kotlin.test.Test
import kotlin.test.assertEquals

class RectangleTest {

    @Test
    fun `test rectangle area calculation`() {
        val rectangle = Rectangle(10.0, 5.0)
        val expectedArea = 50.0
        assertEquals(expectedArea, rectangle.area(), "The area of the rectangle is incorrect")
    }


}
