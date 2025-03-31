package sec04_hof

/**
 * LAMBDA FUNCTIONS
 *
 * Lambda functions are a simple way to create functions ad-hoc.
 */
fun main() {
    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase4("hello"))
    println(upperCase5("hello"))
}

/**
 * Create all lambda functions.
 */
val upperCase1: (String) -> String = { str: String -> str.uppercase() }
val upperCase2: (String) -> String = { str -> str.uppercase() }
val upperCase3 = { str: String -> str.uppercase() }
val upperCase4: (String) -> String = { it.uppercase() }
val upperCase5: (String) -> String = String::uppercase