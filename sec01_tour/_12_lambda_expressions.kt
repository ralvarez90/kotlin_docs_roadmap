/**
 * LAMBDA EXPRESSIONS
 *
 * Kotlin allows you to write even more concise code for functions. Lambda
 * expression can be used in a number of ways. You can:
 * - Pass a lambda expression as a parameter to another function
 * - Return a lambda expression from a function
 * - Invoke a lambda expression on its own
 */
fun main() {
    // value type: (String) -> String
    val lowerCasting = { text: String -> text.lowercase() }
    val upperCasting = { text: String -> text.uppercase() }

    // get message
    val message = input("Input message:  ")
    println(lowerCasting(message))
    println(upperCasting(message))

    // lambda expression without parameters
    val sayHello: () -> Unit = { println("Hello World") }
    sayHello()

    // pass lambda expression to a function, example 1
    val isNegative: (Int) -> Boolean = { it < 0 }
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter(isNegative)
    val negatives = numbers.filter { it < 0 }
    println("numbers: $negatives, positives: $positives, negatives: $negatives")

    // pass lambda expression to a function, example 2
    val getTriple: (Int) -> Int = { x -> x * 3 }
    val triples = numbers.map(getTriple)
    val negativesList = numbers.map({ x -> x * -1 })
    println("triples: $triples")
    println("negativesList: $negativesList")
}

private fun input(prompt: String = ""): String {
    print(prompt)
    return readln()
}