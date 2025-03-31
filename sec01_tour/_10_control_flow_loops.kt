/**
 * CONTROL FLOW: LOOPS
 */
fun main() {
    // for example 1
    for (i in 1..5) {
        print(i)
        if (i == 5) {
            println()
        }
    }

    // example 2
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

}