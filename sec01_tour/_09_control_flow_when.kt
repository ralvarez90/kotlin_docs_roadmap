/**
 * CONTROL FLOW: WHEN
 */
fun main() {
    // example 1
    val someObj: String = input("Input text: ")
    when (someObj) {
        "1" -> println("One")
        "2" -> println("Two")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }

    // Using like expression
    val result = when (someObj.lowercase()) {
        "1" -> "One"
        "2" -> "Two"
        "hello" -> "Greeting"
        else -> "Unknown"
    }

    println(result)
}

private fun input(prompt: String = ""): String {
    print(prompt)
    return readln()
}