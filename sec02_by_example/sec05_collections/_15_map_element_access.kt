package sec05_collections

/**
 * MAP ELEMENT ACCESS
 *
 * When applied to a map, [] operator returns the value corresponding to the given
 * key, or null if there is no such key in the map.
 *
 * The getValue functions returns an existing value corresponding to the given key or
 * throws an exception if the key wasn't found.
 *
 *
 */
fun main() {
    // Using [] operator
    val someMap = mapOf("key1" to 45)
    val value1 = someMap["key1"]
    val value2 = someMap["key2"]
    println("value1: $value1, value2: $value2")

    // Using getValue function
    try {
        val value3 = someMap.getValue("key1")
        val value4 = someMap.getValue("key2")
        println("value3: $value3, value4: $value4")
    } catch (e: NoSuchElementException) {
        println("error: ${e.message}")
    }

    // Using withDefault, create wrapper of original map
    val mapWithDefault = someMap.withDefault { k -> k.length }
    println(mapWithDefault.getValue("key1"))
    println(mapWithDefault.getValue("key2"))
}