package sec04_hof

import kotlin.random.Random

/**
 * HIGHER ORDER FUNCTIONS
 *
 * A hog is any functions that takes another functions as parameter or (inclusive)
 * returns a function.
 *
 * Notes:
 * ::functionName is the notation that references a function by name in Kotlin.
 */
fun main() {
    // example 1, take function as parameter
    val sumResult = calculate(x = 5, y = 5, operation = ::getSum)
    println("sumResult = $sumResult")

    // example 2, return function
    val randOperation = getRandomOperation()
    println("randOperation(5) = ${randOperation(5)}")
}

/**
 * Takes a functions as parameter.
 */
private fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

/**
 * Takes two integers x and y and return x + y.
 */
private fun getSum(x: Int, y: Int): Int {
    return x + y
}

/**
 * Return square of number x.
 */
private fun square(n: Int): Int = n * n

/**
 * Return the negative version of a number.
 */
private fun getNegative(n: Int): Int = -n

/**
 * Return unary random operation.
 */
private fun getRandomOperation(): (Int) -> Int {
    val randInt = Random.nextInt(1, 10)
    return if (randInt % 2 == 0) ::square else ::getNegative
}