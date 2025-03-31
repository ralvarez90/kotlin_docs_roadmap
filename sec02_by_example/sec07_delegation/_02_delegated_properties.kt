package sec07_delegation

import kotlin.reflect.KProperty


/**
 * DELEGATED PROPERTIES
 *
 * Kotlin provides a mechanism of delegated properties that allows delegating
 * the calls of the property.
 */
fun main() {

}

private class Delegate() {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }
}