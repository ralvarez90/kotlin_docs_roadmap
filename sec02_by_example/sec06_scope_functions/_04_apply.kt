package sec06_scope_functions

/**
 * APPLY
 *
 * The apply function executes a block of code on an object and returns the object
 * itself.
 */
fun main() {
    // create person instance
    val jake = Person()
    val stringDescription = jake.apply {
        name = "Jake"
        age = 30
        about = "Android Developer"
    }.toString()
    println(stringDescription)
}

/**
 * Person data class.
 */
private data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}