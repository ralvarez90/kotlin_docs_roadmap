package sec05_collections

/**
 * FIND AND FIND LAST
 *
 * The find and findLast functions return the first or the last collection element that matches
 * the given predicate. If there are no such elements, these functions return null.
 */
fun main() {
    val words: List<String> = "Lets find something in collection somehow".split(" ")
    println("words: $words")

    val first: String? = words.find { w -> w.startsWith("some") }
    println("first: $first")

    val last: String? = words.findLast { it.startsWith("some") }
    println("last: $last")

    val nothing = words.find { it.contains("nothing") }
    println("nothing: $nothing")

}