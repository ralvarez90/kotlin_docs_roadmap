package sec05_collections

import kotlin.math.abs

/**
 * SORTED
 *
 * The sorted list returns a list of collection elements sorted according to their
 * natural sort order (ascending).
 *
 * The method sortedBy sorts elements according to natural sort order of the values
 * returned by specify selector function.
 */
fun main() {
    // sorted items
    val shuffled = listOf(5, 4, 2, 1, 3, -10)
    println("shuffled: $shuffled")

    val natural = shuffled.sorted()
    println("natural: $natural")

    val inverted = shuffled.sortedBy { -it }
    println("inverted: $inverted")

    val descending = shuffled.sortedDescending()
    println("descending: $descending")

    val descendingBy = shuffled.sortedByDescending { abs(it) }
    println("descendingBy: $descendingBy")
}