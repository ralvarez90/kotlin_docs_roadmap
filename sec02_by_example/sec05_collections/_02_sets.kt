package sec05_collections

/**
 * SETS
 *
 * A set is an unordered collection that does not support duplicates. For creating
 * sets there are functions setOf and mutableSetOf
 */
fun main() {
    val newIssue = "unique4"
    val issueAlreadyIn = "unique2"
    println("Issue $newIssue ${getStatusLog(addIssue(newIssue))}")
    println("Issue $issueAlreadyIn ${getStatusLog(addIssue(issueAlreadyIn))}")
}

/**
 * Global private set.
 */
private val openIssues: MutableSet<String> = mutableSetOf("unique1", "unique2", "unique3")

/**
 * Add issue on global set.
 */
private fun addIssue(uniqueDescription: String): Boolean {
    return openIssues.add(uniqueDescription)
}

/**
 * Get status log.
 */
private fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected"
}