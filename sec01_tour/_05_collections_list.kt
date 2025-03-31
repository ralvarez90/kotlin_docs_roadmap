/**
 * LISTS
 *
 * List store items in the order they are added. We have many functions to create
 * list instances.
 *
 * Can access to each item using index access operator [].
 */
fun main() {
    // read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    // mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes.add("rectangle")
    println(shapes)

    // iterate over a list
    for (i in shapes.indices) {
        println("shapes[$i] -> ${shapes[i]}")
    }

    // using some extension functions
    println("shapes.first(): ${shapes.first()}")
    println("shapes.last() : ${shapes.last()}")

    // get length list
    println("Total items in shapes: ${shapes.size}")
    println("Total items in shapes: ${shapes.count()}")

    // using in operator
    if ("square" in shapes) {
        println("Square in shapes: ${"square" in shapes}")
    }

}