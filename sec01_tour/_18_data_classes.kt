/**
 * DATA CLASSES
 *
 * Data classes have the same functionality as classes, but they come
 * automatically with additional member functions.
 */
fun main() {
    val user1 = User("John", 1)
    val user2 = User("Peter", 2)
    val user3 = user1.copy()
    println("user1: $user1")
    println("user2: $user2")
    println("user3: $user3")
    println("user1 == user2 -> ${user1 == user2}")
    println("user1 == user3 -> ${user1 == user3}")
}

/**
 * Custom user data class
 */
private data class User(val name: String, val id: Int)
