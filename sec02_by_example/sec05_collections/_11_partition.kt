package sec05_collections

/**
 * PARTITION
 *
 * The partition function splits the original collection in to a pair
 * of lists using a given predicate.
 */
fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    println("numbers: $numbers")

    // example 1
    val evenOdd: Pair<List<Int>, List<Int>> = numbers.partition { it % 2 == 0 }
    println("evenOdd: $evenOdd")

    // example 2
    val (positives, negatives) = numbers.partition { it > 0 }
    println("positives: $positives")
    println("negatives: $negatives")
}