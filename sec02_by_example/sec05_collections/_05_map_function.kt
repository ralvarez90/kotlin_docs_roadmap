package sec05_collections

/**
 * MAP EXTENSION FUNCTION
 *
 * The map extension function enables you to apply a transformation to all elements
 * in a collection. It takes a transformer functions as a lambda-parameter.
 */
fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    println("numbers: $numbers")

    val squares = numbers.map { x -> x * x }
    println("squares: $squares")

    val tripled = numbers.map { it * 3 }
    println("tripled: $tripled")
}