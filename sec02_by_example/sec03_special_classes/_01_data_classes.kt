package sec03_special_classes

/**
 * DATA CLASSES
 *
 * Data classes make it easy to create classes that are used to store values.
 */
fun main() {
    // create instances
    val user1 = User("Alex", 1)
    println("user1: $user1")

    // create instances
    val user2 = User("Alex", 1)
    val user3 = User("Max", 2)
}

private data class User(val name: String, val id: Int)