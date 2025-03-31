/**
 * FUNCTION TYPES
 *
 * Lambda expressions can be returned from a function. Lambda expression can be invoked
 * on their own by adding parentheses after the curly braces.
 */
fun main() {

    // return a lambda expression example
    val timeInMinutes = listOf(2, 10, 15, 1)
    val min2sec: (Int) -> Int = toSeconds("minute")
    val totalTimeINSeconds = timeInMinutes.map(min2sec).sum()
    println("Total time in $totalTimeINSeconds secs")

    // return and invoke lambda expression
    println({ text: String -> text.uppercase() }("Hello"))
}

private fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}
