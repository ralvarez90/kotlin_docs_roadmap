package sec05_collections

/**
 * FILTER
 *
 * The filter function enables you to filter collections. It takes a filter predicate as a
 * lambda parameter. The predicate is applied to each element. Elements that make the predicate
 * true are returned in the result collection.
 */
fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    println("original numbers: $numbers")

    val positives = numbers.filter { x -> x > 0 }
    println("positives: $positives")

    val negatives = numbers.filter { it < 0 }
    println("negatives: $negatives")
}