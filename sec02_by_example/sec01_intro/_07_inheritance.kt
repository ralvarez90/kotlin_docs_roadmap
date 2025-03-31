package sec01_intro

/**
 * INHERITANCE
 *
 * We define open class to extends this class. Kotlin class are final by
 * default. If you want to allow the class inheritance, mark the class with the
 * open modifier.
 *
 * Kotlin methods are also final by default. As with the classes, the open
 * modifier allows overriding them.
 *
 * If you want to use a parameterized constructor of the superclass when
 * creating a subclass, provide the constructor arguments in the subclass
 * declaration.
 */
fun main() {
    // example 1,
    val someDog: Dog = Yorkshire()
    someDog.sayHello()

    // example 2
    val lion: Lion = Asiatic("John")
    lion.sayHello()
}

/**
 * Private open class.
 */
private open class Dog {
    open fun sayHello() {
        println("Barf! barf!")
    }
}

/**
 * Private class with inheritance example.
 */
private class Yorkshire : Dog() {
    override fun sayHello() {
        println("Wif! wif!")
    }
}

private open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

private class Asiatic(name: String) : Lion(name = name, origin = "India")