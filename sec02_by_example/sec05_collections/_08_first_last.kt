package sec05_collections

/**
 * FIRST AND LAST
 *
 * These functions return the first and the last element of the collection
 * correspondingly. Yoy can also use them with a predicate; in this case,
 * they return the first or the last element that matches the given predicate.
 *
 * If a collection is empty or doesn't contain elements matching the predicate,
 * the functions throw NoSuchElementException.
 *
 * The functions firstOrNull and lastOrNull work almost the same way with one
 * difference: the return null if there are no matching elements.
 */
fun main() {
    // example 1
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val first = numbers.first()
    val last = numbers.last()
    println("first: $first, last: $last")

    // example 2
    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last(predicate = { it % 2 != 0 })
    println("firstEven: $firstEven, lastOdd: $lastOdd")
}