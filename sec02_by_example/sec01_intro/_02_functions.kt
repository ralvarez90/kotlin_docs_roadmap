package sec01_intro


/**
 * FUNCTIONS
 */
fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}

/**
 * Simple function that takes a parameter of type String and return
 * Unit.
 */
private fun printMessage(message: String): Unit {
    println(message)
}

/**
 * A function that takes a second optional parameter with default value.
 */
private fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message]")
}

/**
 * A function that returns an integer.
 */
private fun sum(x: Int, y: Int): Int {
    return x + y
}

/**
 * A single expression function that returns and integer (inferred)
 */
private fun multiply(x: Int, y: Int) = x * y