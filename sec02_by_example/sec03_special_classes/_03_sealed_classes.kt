package sec03_special_classes

/**
 * SEALED CLASSES
 *
 * Sealed classes let you restrict the use of inheritance. Once you declare
 * a class sealed, it can only be subclassed from inside the same package
 * where the sealed class is declared.
 */
fun main() {
    println(greetMammal(Cat("Pickles")))
}

private sealed class Mammal(val name: String)

private class Cat(val catName: String) : Mammal(catName)
private class Human(val humanName: String, val job: String) : Mammal(humanName)

private fun greetMammal(mammal: Mammal): String {
    return when (mammal) {
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> "Hello ${mammal.name}"
    }
}