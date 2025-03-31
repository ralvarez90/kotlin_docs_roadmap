package sec01_intro

/**
 * OPERATOR FUNCTIONS
 *
 * Certain functions can be "upgraded" to operators, allowing their calls with the
 * corresponding operator symbol.
 */
fun main() {
    // example 1
    println(2 * "Hello World!")

    // example 2
    val someStr = "Always forgive your enemies: nothing annoys them so much."
    println(someStr[0..10])
}

/**
 * Example 1
 */
private operator fun Int.times(str: String) = str.repeat(this)

/**
 * Operator function example.
 */
private operator fun String.get(range: IntRange): String {
    return substring(range)
}