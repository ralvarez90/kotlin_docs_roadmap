/**
 * SET
 *
 * Sets are unordered and only store unique items. To create read-only set use the setOf
 * functions and to create mutable set use mutableSetOf function.
 */
fun main() {
    // read only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "kiwi", "cherry")
    println("readOnlyFruit: $readOnlyFruit")

    // create mutable set with explicit type declaration
    val fruits: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")
    fruits.add("watermelon")
    println("fruits: $fruits")

    // to prevent unwanted modifications, you can create read-only view of a mutable
    // set
    val _fruits: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")
    val fruitsLocked: Set<String> = _fruits
}