fun main() {
    val inferredType = 42
    for (i in 1..10){
        println(inferredType)
    }
    val x = 2
    when (x) {
        1 -> println("chupa chups cola flavour")
        2 -> println("superpower")
        else -> {
            println("x is neither 1 and 2")
        }
    }
}