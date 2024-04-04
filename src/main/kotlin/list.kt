fun main() {
    val readOnlyShapes = listOf("triange", "square", "cirle", "Hexagon")
    println(readOnlyShapes)
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    val shapesLocked: List<String> = shapes // to prevent unwanted modifications in mutable list. This is also called casting

    println("My favourite shape is ${readOnlyShapes[3]}")
    println("My second favourite shape is ${readOnlyShapes.first()}")
}