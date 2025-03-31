/**
 * MEMBER FUNCTIONS
 *
 * In addition to declaring properties as part of an object's characteristics, you
 * can also define an object's behaviour with member functions also called methods.
 *
 * In Kotlin, member functions must be declared within the class body.
 */
fun main() {
    // create instances and invoke member function
    val contact = CustomContact(1, "john_wick@gmail.com")
    contact.printId()
}

private class CustomContact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}