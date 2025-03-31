import kotlin.math.PI

/**
 * FUNCTIONS
 */
fun main() {
    // example 1
    sayHello()

    // example 2
    for (i in 1..10) {
        println("$i + ${i + 1} -> ${getSum(i, i + 1)}")
    }

    // example 3, using named arguments
    printMessageWithPrefix(
        prefix = "Log",
        message = "Hello",
    )

    // example 4, using only one named parameter with default value
    printMessageWithPrefix("Hello")

    // example 5, using single expression function
    println(getDiff(x = 10, y = 5))

    // example 6, show circle area
    for (i in 1..5) {
        println("If radius -> $i units, then area: ${circleArea(radius = i.toDouble())} u^2")
    }
}

/**
 * Show a hello message in console.
 */
private fun sayHello() {
    println("Hello World")
}

/**
 * Return the sum of two integers.
 */
private fun getSum(x: Int = 0, y: Int = 0): Int {
    return x + y
}

/**
 * Return difference between two integers.
 */
private fun getDiff(x: Int = 0, y: Int = 0): Int = x - y


/**
 * Show a compound message.
 */
private fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

/**
 * Return the circle area.
 */
fun circleArea(radius: Double): Double = PI * radius * radius