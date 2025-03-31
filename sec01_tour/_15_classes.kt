/**
 * CLASSES
 *
 * Kotlin supports object-oriented programming with classes and
 * objects.
 *
 * To declare a class, use class keyword. Characteristics of a class's object can be
 * declared in properties.
 *
 * We recommended that you declare properties as read-only values. Kotlin classes can
 * ve have many constructors.
 *
 * To access a property of an instances, write the name of the property after
 * the instances name appended with a period .
 */
fun main() {
    // create instance example
    val contact = Contact(1, "peter_parker@gmail.com")
    contact.email = "peterparker@gmail.com"
    println("contact.id   : ${contact.id}")
    println("contact.email: ${contact.email}")

}

/**
 * Class with properties after the class name.
 */
private class Customer(val id: Int, var email: String)

/**
 * Class with body defined by curly braces.
 */
private class Contact(val id: Int, var email: String) {
    val category: String = ""
}