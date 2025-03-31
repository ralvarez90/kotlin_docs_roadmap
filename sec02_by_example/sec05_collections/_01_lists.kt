package sec05_collections

/**
 * LISTS
 *
 * A list is an ordered collection of items. In kotlin lists can be either mutable
 * (MutableList) or read-only (List). For list creation we can use listOf and mutableListOf
 * functions.
 */
fun main() {
    // add system users
    addSystemUser(newUser = 4)
    addSystemUser(newUser = 5)

    println("Number of sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach { i ->
        println("Some useful info on user $i")
    }
}


/**
 * Private global lists
 */
private val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
private val sudoers: List<Int> = systemUsers

/**
 * Add new system user.
 */
private fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

/**
 * Return al sudoers users.
 */
private fun getSysSudoers(): List<Int> {
    return sudoers
}