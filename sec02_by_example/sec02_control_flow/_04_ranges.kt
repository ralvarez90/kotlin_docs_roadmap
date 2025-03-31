package sec02_control_flow

/**
 * RANGES
 *
 * In kotlin exists a set of tools for defining ranges. Char ranges
 * are supported. Ranges are also useful if statement.
 */
fun main() {
    // example 1
    for (i in 1..3) {
        print(i)
    }
    println()

    // example 2
    for (i in 1..<3) {
        print(i)
    }
    println()

    // example 3
    for (i in 1..8 step 2) {
        print(i)
    }
    println()

    // example 4
    for (i in 3 downTo 1) {
        print(i)
    }
    println()

    // example 5
    for (c in 'a'..'z') {
        print(c)
    }
    println()

    // example 6
    val x = 2
    if (x in 1..10) {
        println("x is in the range")
    }
}