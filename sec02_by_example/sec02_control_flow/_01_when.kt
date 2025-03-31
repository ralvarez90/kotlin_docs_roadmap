package sec02_control_flow

/**
 * WHEN
 *
 * Kotlin provides the more flexible and clear when construction. It can be
 * used either as a statement or as an expression.
 */
fun main() {
    // example 1
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")

    // example 2
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

private class MyClass

/**
 * This function use when like statement.
 */
private fun cases(obj: Any): Unit {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

/**
 * This function use when like expression.
 */
private fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "One"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}