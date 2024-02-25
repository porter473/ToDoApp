package com.example.service

import java.awt.Rectangle
import kotlin.test.Test
import kotlin.test.assertEquals

class RectangleTest {

    @Test
    fun `test rectangle area calculation`() {
        val rectangle = Rectangle(10.0, 2.0)
        val expectedArea = 20.0
        assertEquals(expectedArea, rectangle.area(), "The area of the rectangle is incorrect")
    }
}
