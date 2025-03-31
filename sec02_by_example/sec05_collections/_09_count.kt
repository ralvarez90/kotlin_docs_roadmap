package sec05_collections

/**
 * COUNT
 *
 * The count functions returns either the total number of elements in a
 * collection or the number if the elements matching the
 * given predicate.
 */
fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val totalCount = numbers.count()
    println("totalCount: $totalCount")
    
    val evenCount = numbers.count { x -> x % 2 == 0 }
    println("evenCount: $evenCount")
}