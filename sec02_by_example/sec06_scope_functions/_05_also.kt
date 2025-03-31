package sec06_scope_functions

/**
 * ALSO
 *
 * The function also works like apply: it executes a given block and returns the
 * object called. Inside the block, the object is referenced by it.
 */
fun main() {
    val jake = User("Jake", 30, "Android Developer")
    jake.also {
        writeCreationLog(it)
    }
}

/**
 * Data class example.
 */
private data class User(var name: String, val age: Int, var about: String) {
    constructor() : this("", 0, "")
}

/**
 * Show a message when some user is created.
 */
private fun writeCreationLog(user: User) {
    println("A mew user ${user.name} was created.")
}
