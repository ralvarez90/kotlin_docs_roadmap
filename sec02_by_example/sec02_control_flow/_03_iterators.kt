package sec02_control_flow

/**
 * ITERATORS
 *
 * You can define your own iterators in your classes by implementing the iterator
 * operator in them.
 */
fun main() {

    // zoo instances
    val zoo = Zoo(
        animals = listOf(Animal("zebra"), Animal("lion"))
    )

    // using iterator
    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }

    // get animals iterator
    val animalsIterator = zoo.animals.iterator()
    while (animalsIterator.hasNext()) {
        val animal = animalsIterator.next()
        println("Animal -> $animal")
    }
}

private data class Animal(val name: String)

private class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}