package sec06_scope_functions

/**
 * LET
 *
 * The kotlin standard library function let can be used for scoping and null-checks.
 * When called on an object, let executes the given block of code and returns the result
 * of its last expression.
 *
 * The object is accessible inside the block by the reference it (by default) or a custom
 * name.
 *
 * The keyword let, is used to create a temporary scope within which an object can be accessed using
 * it keyword. It is specially useful for working with objects that can be null and to chain
 * operations in a more concise and readable style.
 */
fun main() {

    val empty = "test".let {
        customPrint(it)
        it.isEmpty()
    }
    println(" is empty: $empty")

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First", "Second")
}

/**
 * Show s string in upper case.
 */
private fun customPrint(s: String) {
    print(s.uppercase())
}

/**
 * Using let function.
 */
private fun printNonNull(str: String?) {
    println("Printing \"$str\":")
    str?.let {
        print("\t")
        customPrint(it)
        println()
    }
}

/**
 *
 */
private fun printIfBothNonNull(strOne: String?, strTwo: String?) {
    strOne?.let { firstString ->
        strTwo?.let { secondString ->
            customPrint("$firstString : $secondString")
            println()
        }
    }
}