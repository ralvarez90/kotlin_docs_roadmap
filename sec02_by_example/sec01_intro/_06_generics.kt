package sec01_intro

/**
 * GENERICS
 *
 * Generics are a genericity mechanism that's become standard in modern
 * languages.
 */
fun main() {
    // create generic instance
    val numbers = MutableStack<Int>()
    numbers.push(123)
    numbers.push(124)
    println(numbers)

    // create other instance
    val otherStack: MutableStack<Double> = mutableStackOf(123.0, 124.0, 125.0)
    println(otherStack)
}

private fun <T> mutableStackOf(vararg elements: T): MutableStack<T> {
    return MutableStack(*elements)
}

/**
 * Private class example working with generic type T.
 */
private class MutableStack<T>(vararg items: T) {

    // store all elements inside stack
    private val elements = items.toMutableList()

    fun push(item: T) {
        elements.add(item)
    }

    fun peek(): T {
        return elements.last()
    }

    fun pop(): T {
        return elements.removeAt(elements.size - 1)
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }

    fun size(): Int {
        return elements.size
    }

    override fun toString(): String {
        return "MutableStack(${elements.joinToString()})"
    }

}