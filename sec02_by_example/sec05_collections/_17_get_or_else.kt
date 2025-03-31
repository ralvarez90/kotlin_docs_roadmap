package sec05_collections

/**
 * GET OR ELSE
 *
 * The getOrElse functions provides safe access to elements of a collection. It takes an index
 * and functions that provides default value in cases when the index is out of bound.
 *
 * This function can also be applied to Map to get the value for the given key.
 */
fun main() {
    // using with list
    val someList = listOf(0, 10, 20)
    println("someList: $someList")
    println("someList.getOrElse(1 ) { 42 } : ${someList.getOrElse(1) { 42 }}")
    println("someList.getOrElse(10) { 42 } : ${someList.getOrElse(10) { 42 }}")

    // using with map
    val someMap = mutableMapOf<String, Int?>()
    println("someMap.getOrElse(\"x\") {1} : ${someMap.getOrElse("x") { 1 }}")

    // update map
    someMap["x"] = 3
    println("someMap.getOrElse(\"x\") {1} : ${someMap.getOrElse("x") { 1 }}")

    // update map
    someMap["x"] = null
    println("someMap.getOrElse(\"x\") {1} : ${someMap.getOrElse("x") { 1 }}")
}