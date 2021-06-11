import java.util.stream.Collectors

class Examples {

    fun example1(name: String) = "Hello, $name. Your name is ${name.length} characters long"

    fun example2(from: Int) = buildString {
        for (i in from downTo 0) append("$i\n")
    }

    fun example3(domain: String) =
        sequenceOf("joe@example.com", "nancy@example.com", "coach@sammancoaching.org")
            .filter { domain in it }
            .joinToString()

    fun example4(colour: String) = when (colour) {
        "Red" -> "Warm"
        "Green" -> "Happy"
        "Blue" -> "Calm"
        else -> throw IllegalArgumentException("Invalid colour")
    }

}