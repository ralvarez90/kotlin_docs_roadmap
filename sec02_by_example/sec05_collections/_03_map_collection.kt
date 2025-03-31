package sec05_collections

/**
 * MAP
 *
 * A map is a collection of key-value pairs, where each keys unique and is used to retrieve
 * the corresponding value.
 *
 * For creating maps, there are functions mapOf and mutableMapOf. Using the 'to' infix
 * function makes initialization less noisy.
 */
fun main() {
    accountReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountReport()
}

/**
 * Global constant.
 */
private const val POINTS_X_PASS: Int = 15
private val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
private val EZPassReport: Map<Int, Int> = EZPassAccounts

/**
 * Update points in credit.
 */
private fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

/**
 * Show accounts report.
 */
private fun accountReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach { (k, v) -> println("ID $k: credit: $v") }
}