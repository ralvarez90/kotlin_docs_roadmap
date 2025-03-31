/**
 * NULL SAFETY
 *
 * Kotlin supports nullable types which allows the possibility for the declared
 * type have null values.
 *
 * To safely access properties of a nullable object use the safe call operator. This
 * operator returns null if either the object or one of its accessed properties is
 * null.
 */
fun main() {
    // example 1, hast a string type
    var neverNull: String = "This can't be null"
    neverNull = "$neverNull!"
    println(neverNull)

    // example 2, nullable string
    var strNullable: String? = "This can keep a null here"
    strNullable = null
    println(strNullable ?: "strNullable is null")

    // example 3, safe call
    val nullString: String? = null
    println(nullString?.uppercase())
}