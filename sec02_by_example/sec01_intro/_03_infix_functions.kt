package sec01_intro

/**
 * INFIX FUNCTIONS
 *
 * Member functions and extensions with a single parameter can be turned into infix functions.
 */
fun main() {
    // example 1
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye")

    // example 2
    val pair = "Ferrari" to "Katrina"
    println("pair: $pair")

    // example 3
    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println("myPair: $myPair")

    // example 4
    val peter = Person("Peter")
    val john = Person("John")
    peter likes john
    println(peter.likePeople)
    println(john.likePeople)
}

private class Person(val name: String) {
    val likePeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likePeople.add(other)
    }
}

