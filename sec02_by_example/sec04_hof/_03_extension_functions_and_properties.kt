package sec04_hof

/**
 * EXTENSION FUNCTIONS AND PROPERTIES
 *
 * Kotlin lets you add new members to any class with the
 * extension mechanism.
 */
fun main() {
    // run example
    val order =
        Order(
            listOf(
                Item(name = "Bread1", price = 128f),
                Item(name = "Bread2", price = 129f),
                Item(name = "Bread3", price = 130f),
            )
        )

    // Invoke extension methods
    println("order_item_max_price: ${order.maxPriceItemValue()}")
    println("           with name: ${order.maxPriceItemName()}")
}

/**
 * Item data class with two properties.
 */
private data class Item(val name: String, val price: Float)

/**
 * Order data class with a single list items as property.
 */
private data class Order(val items: List<Item>)

/**
 * Extension function over Order class.
 */
private fun Order.maxPriceItemValue(): Float {
    return this.items.maxByOrNull { it.price }?.price ?: 0F
}

/**
 * Extension function over Order class.
 */
private fun Order.maxPriceItemName(): String {
    return this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"
}

/**
 * Extension property
 */
private val Order.commaDelimitedNames: String
    get() = items.joinToString { it.name }