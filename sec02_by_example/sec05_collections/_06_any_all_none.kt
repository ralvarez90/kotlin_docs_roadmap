package sec05_collections

/**
 * ANY, ALL, NONE
 *
 * These functions check the existence of collection elements that match a
 * given predicate.
 *
 * Function any returns true if the collection contains at least one element that
 * matches the given predicate.
 */
fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    println("numbers: $numbers")

    // any example
    val haveANegative = numbers.any { x -> x < 0 }
    println("The collection $numbers have a negative number: $haveANegative")
    val withGreaterThan6 = numbers.any { it > 6 }
    println("The collection $numbers have a greater than 6: $withGreaterThan6")

    // all example
    var allEven = numbers.all { it % 2 == 0 }
    var allLess6 = numbers.all { it < 6 }
    println("allEven: $allEven")
    println("allLess6: $allLess6")

    // none
    allEven = numbers.none { it % 2 == 0 }
    allLess6 = numbers.none() { it > 6 }
    println("allEven: $allEven")
    println("allLess6: $allLess6")

}