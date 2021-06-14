package org.sammancoaching

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExamplesTest {

    @Test
    fun example1() {
        val output = Examples().example1("Joe")
        assertEquals(output, "Hello, Joe. Your name is 3 characters long")
    }

    @Test
    fun example2() {
        val output = Examples().example2(5)
        assertEquals(output, "5\n4\n3\n2\n1\n0\n")
    }

    @Test
    fun example3() {
        val output = Examples().example3("example.com")
        assertEquals(output, "joe@example.com, nancy@example.com")
    }

    @Test
    fun example4() {
        assertEquals(Examples().example4("Green"), "Happy")
    }
}