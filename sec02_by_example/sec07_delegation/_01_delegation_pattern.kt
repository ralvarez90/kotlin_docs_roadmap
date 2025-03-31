package sec07_delegation

/**
 * DELEGATION PATTERN
 *
 * Kotlin supports easy implementation of the delegation pattern on the
 * native level without any boilerplate code.
 *
 * Kotlin simplify this implementation using by keyword. This keyword allows
 * delegate the implementation.
 *
 * In this example, Derived class can implement an interface Base by
 * delegating all of its public members to a specified object.
 */
fun main() {
    val tomAraya = TomAraya("Trash Metal")
    tomAraya.makeSound()

    val elvisPresley = ElvisPresley("Dancing to the Jailhouse Rock.")
    elvisPresley.makeSound()
}

/**
 * Interface of behaviour.
 */
private interface SoundBehaviour {
    fun makeSound()
}

/**
 * Some implementation of SoundBehaviour
 */
private class ScreamBehaviour(val n: String) : SoundBehaviour {
    override fun makeSound() {
        println("${n.uppercase()} !!!")
    }
}

/**
 * Some implementation of SoundBehaviour.
 */
private class RockAndRollBehaviour(val n: String) : SoundBehaviour {
    override fun makeSound() {
        println("I'm The King of Rock and Roll: $n")
    }
}

/**
 * Tom Araya is the "singer" of Slayer.
 */
private class TomAraya(n: String) : SoundBehaviour by ScreamBehaviour(n)

/**
 * You should know
 */
private class ElvisPresley(n: String) : SoundBehaviour by RockAndRollBehaviour(n)