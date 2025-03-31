package sec02_control_flow

/**
 * EQUALITY CHECKS
 *
 * Kotlin uses == for structural comparison and === for referential comparison.
 */
fun main() {
    val authors = setOf("shakespeare", "hemingway", "twain")
    val writers = setOf("twain", "shakespeare", "hemingway")
    println("authors: $authors")
    println("writers: $writers")
    println("authors ==  writers: ${authors == writers}")
    println("authors === writers: ${authors === writers}")
}