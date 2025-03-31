package sec05_collections

/**
 * ASSOCIATE BY AND GROUP BY
 *
 * Functions associateBy and groupBy build maps from elements of a collection
 * indexed by the specified key.
 *
 * The key is defined in the keySelector parameter. You can also specify and
 * optional valueSelector to define what will be stored in the value of the map
 * element.
 *
 * The difference between associateBy and groupBy is how the process objects
 * with the same key.
 */
fun main() {
    // instance from data clsas
    val people = listOf(
        Person("John Wick", "Boston", "(+52)5619332500"),
        Person("Peter Parker", "Michigan", "(+52)5619332511"),
        Person("Tony Stark", "Texas", "(+52)5619332522"),
        Person("Bruce Banner", "Chicago", "(+52)5619332533"),
    )

    // get map with phone as key, and person as value
    val phoneBook: Map<String, Person> = people.associateBy { it.phone }
    println("phoneBook: $phoneBook")

    // get map with phone as key, and city as value
    val cityBook = people.associateBy(Person::phone, Person::city)
    println("cityBook: $cityBook")

    // get map with city as key, and list of string as value
    val peopleCities = people.groupBy(Person::city, Person::name)
    println("peopleCities: $peopleCities")

    // get map with city as key, and last name of each city as value
    val lastPersonCity = people.associateBy(Person::city, Person::name)
    println("lastPersonCity: $lastPersonCity")
}

/**
 * Model data class example.
 */
private data class Person(val name: String, val city: String, val phone: String)