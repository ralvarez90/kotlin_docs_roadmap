/**
 * TRAILING LAMBDAS
 *
 * Lambda expression can be invoked on their own by adding parentheses after the curly
 * braces.
 */
fun main() {

    // Example 1, no trailing lambda
    val result1 = intOperate(1, 2, { x, y -> x + y })
    println("result1: $result1")

    // Example 2, trailing lambda
    val result2 = intOperate(2, 4) { x, y -> x + y }
    println("result2: $result2")

    // Example 3
    println(listOf(1, 2, 3).fold(0) { acc, i -> acc + i })
}

/**
 * This method return and integer.
 */
private fun intOperate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}