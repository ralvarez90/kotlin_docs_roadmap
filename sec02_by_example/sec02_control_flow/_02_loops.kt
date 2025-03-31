package sec02_control_flow

/**
 * LOOPS
 *
 * Kotlin supports all the commonly uses loops: for, while and do-while.
 */
fun main() {
    // example 1, use for to iterate over list.
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    // example 2, using while and do-while
    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 5) {
        eatCake()
        cakesEaten++
    }

    do {
        bakeCake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}

private fun eatCake() {
    println("Eat a cake!")
}

private fun bakeCake() {
    println("Bake a cake!")
}