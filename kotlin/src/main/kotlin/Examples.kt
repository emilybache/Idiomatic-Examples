import java.util.stream.Collectors

class Examples {

    fun example1(name: String): String {
        return "Hello, $name. Your name is ${name.length} characters long"
    }

    fun example2(from: Int): String {
        return buildString  {
            for (i in from downTo 0) append("$i\n")
        }
    }

    fun example3(domain: String): String {
        val emailsList = listOf("joe@example.com", "nancy@example.com", "coach@sammancoaching.org")
        return emailsList.filter { domain in it }.joinToString()
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