package sec06_scope_functions

/**
 * WITH
 *
 * The function with, is a non-extension function than can access members of its argument concisely: you
 * can omit the instance name when referring to its members.
 */
fun main() {
    // create config instance
    val config = Configuration(host = "127.0.0.1", port = 5000)
    with(config) {
        println("$host:$port")
    }

    // instead of
    println("${config.host}:${config.port}")
}

/**
 * Private class for with example.
 */
private class Configuration(var host: String, var port: Int)