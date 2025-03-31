package sec01_intro

/**
 * VARARGS PARAMETERS
 *
 * Varargs allow you to pass any numbers of arguments by separating them with commas.
 */
fun main() {
    // example 1
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
    printAll("Peter Parker", "John Wick")

    // example 2
    printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", prefix = "你好")
}

/**
 * Print each strings.
 */
private fun printAll(vararg messages: String) {
    for (msg in messages) println(msg)
}

private fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (msg in messages) {
        println("$prefix $msg")
    }
}

/**
 * Example use spread operator *
 */
private fun showLogs(vararg entries: String) {
    printAll(*entries)
}