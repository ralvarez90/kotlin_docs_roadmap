/**
 * BASIC TYPES
 *
 * In kotlin, unlike java, there are no primitive data types. All in kotlin is
 * an object.
 *
 * The basic types are:
 * - Byte, UByte
 * - Short, USHort
 * - Int, UInt
 * - Long, ULong
 * - Float, Double
 * - Boolean
 * - Char
 * - String
 */
fun main() {
    val bigInteger = 1_000_000_000_000L
    println("bigInteger: $bigInteger")
    println("Max long instance: ${ULong.MAX_VALUE}")

}