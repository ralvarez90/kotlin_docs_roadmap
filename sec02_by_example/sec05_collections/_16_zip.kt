package sec05_collections

/**
 * ZIP
 *
 * The zip function merges two given collections into a new collection. By default, the
 * result collection contains Pairs of source collection elements with the same index.
 *
 * However, you can define your own structure of the result collection element. The zie of
 * the result collection equals to the minimum size of a source collection.
 */
fun main() {
    // define lists
    val listA = listOf("a", "b", "c")
    val listB = listOf(1, 2, 3, 4)

    // show lists
    println("listA: $listA")
    println("listB: $listB")

    var resultPairs = listA zip listB
    println("listA zip listB: $resultPairs")

    resultPairs = listA.zip(listB)
    println("               : $resultPairs")

    val resultReduce: List<String> = listA.zip(listB) { a, b -> "$a$b" }
    println("resultReduce: $resultReduce")
}