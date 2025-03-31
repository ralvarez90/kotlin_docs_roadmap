/**
 * MAPS
 *
 * This collection store items as key-value pairs. You access the value by
 * referencing the key.
 *
 * To create a read-only map (Map) use mapOf function. To create a mutable
 * map (MutableMap<T, Q>), use mutableMapOf function.
 */
fun main() {

    // read-only map
    val readOnlyJuiceMenu = mapOf(
        "apple" to 100,
        "kiwi" to 101,
        "orange" to 102,
    )
    println(readOnlyJuiceMenu)

    // mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 101, "orange" to 102)
    juiceMenu["watermelon"] = 103
    println("juiceMenu: $juiceMenu")
    println(juiceMenu["banana"])
    println("juiceMenu.keys  : ${juiceMenu.keys}")
    println("juiceMenu.values: ${juiceMenu.values}")

    // eval key contains
    println("orange" in juiceMenu)
}