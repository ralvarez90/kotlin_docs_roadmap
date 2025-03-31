package sec05_collections

/**
 * MIN OR NULL AND MAX OR NULL
 *
 * The functions minOrNull and maxOrdNull return the smallest and the largest element of a
 * collection. If collection is empty, there return null.
 */
fun main() {

    // create simple list
    val numbers = listOf(1, 2, 3)
    println("numbers: $numbers")

    // create empty list
    val empty = emptyList<Int>()
    val only = listOf(3)

    // results
    println("Numbers: $numbers, min=${numbers.minOrNull()}, max = ${numbers.maxOrNull()}")
    println("Empty  : $empty, min=${empty.minOrNull()}, max=${empty.maxOrNull()}")
    println("Only   : $only, min=${only.minOrNull()}, max=${only.maxOrNull()}")
}