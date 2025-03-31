package sec03_special_classes

/**
 * ENUM CLASSES
 *
 * Enum classes are used to model types that represent a finite set of
 * distinct values.
 *
 * Enums may contain properties and methods like other classes, separated
 * from the list of enum constants by a semicolon.
 */
fun main() {
    // example 1
    val state = State.RUNNING
    val message: String = when (state) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)

    // example 2
    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
}

/**
 * Enum class example.
 */
private enum class State {
    IDLE, RUNNING, FINISHED
}

/**
 * Enum with properties.
 */
private enum class Color(val rgb: Int) {
    RED(0XFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}