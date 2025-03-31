package sec05_collections

/**
 * FLAT MAP
 *
 * The flatMap function transform each element of a collection into an iterable object and builds a
 * single list of transformation results.
 */
fun main() {
    // two list of strings
    val fruitsBag = listOf("apple", "orange", "banana", "grapes")
    val clothesBag = listOf("shirts", "pants", "jeans")

    // list of lists
    val shopCart = listOf(fruitsBag, clothesBag)
    println("shopCart  : $shopCart")

    // list of lists
    val mapBag = shopCart.map { it }
    println("mapBag    : $mapBag")

    // flat map
    val flatMapBag = shopCart.flatMap(transform = { it })
    println("flatMapBag: $flatMapBag")
    println("flatMapBag: ${shopCart.flatten()}")
}