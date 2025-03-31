package sec02_control_flow

/**
 * CONDITIONAL EXPRESSION
 *
 * There is no ternary operator in kotlin. Instead, if may be used as an expression.
 */
fun main() {
    // define function
    val getMax: (Int, Int) -> Int = { a, b -> if (a > b) a else b }
    println(getMax(99, -42))
}