package org.sammancoaching

import java.util.stream.Collectors

class Examples {

    fun example1(name: String): String {
        return "Hello, $name. Your name is ${name.length} characters long"
    }

    fun example2(from: Int): String {
        val countDown = StringBuilder()
        val n = (from downTo 0)
        for (i: Int in n) {
            countDown.append(i)
            countDown.append("\n")
        }
        return countDown.toString()
    }

    fun example3(domain: String): String {
        val emailsList = listOf("joe@example.com", "nancy@example.com", "coach@sammancoaching.org")
        val result = ArrayList<String>()
        for (e: String in emailsList) {
            if (e.contains(domain)) result.add(e)
        }
        return result.stream().collect(Collectors.joining(", "))
    }

    fun example4(colour: String): String {
        return when (colour) {
            "Red" -> "Warm"
            "Green" -> "Happy"
            "Blue" -> "Calm"
            else -> throw IllegalArgumentException("Invalid color")
        }
    }

}