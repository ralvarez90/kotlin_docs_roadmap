package sec03_special_classes

import kotlin.random.Random

/**
 * OBJECT KEYWORD
 *
 * Classes and objects in Kotlin work the same way as in most object-oriented
 * programming languages: Class is a blueprint and objects is an instance of
 * a class.
 *
 * In kotlin you also have the object keyword. It is used to obtain data type
 * with a single implementation.
 *
 * An object declaration inside a class defines another useful case:
 * the companion object. Syntactically it's similar to the static methods in Java
 */
fun main() {
    // create normal instances, example 1
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()
    d1.getNumber()
    d2.getNumber()

    // example 2, object expression
    rentPrice(10, 2, 1)
    rentPrice(11, 3, 2)

    // example 3, object declaration
    DoAuth.takeParams("ra90", "les@123")

    // example 4, companion object
    BigBen.getBongs(12)
}


/**
 * Usually class.
 */
private class LuckDispatcher {
    fun getNumber() {
        val objRandom = Random(System.currentTimeMillis())
        println(objRandom.nextInt(90))
    }
}

/**
 * Use object expression.
 */
private fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {
    val dayRates = object {
        var standard = 30 * standardDays
        var festivity = 50 * festivityDays
        var special = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special
    println("Total: $total")
}

/**
 * Object declaration.
 */
object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

/**
 * Companion object.
 */
class BigBen {
    companion object {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("Bong ")
            }
        }
    }
}