//fun main() {
//    val s = readln()
//        .drop(1)
//        .dropLast(1)
//        .split(", ")
//        .filter { it.isNotEmpty() }
//        .toSet()
//        .size
//    println(s)
//}

fun main() {
    val s = readln()
        .filter { it.isLowerCase() }.toSet().size
    println(s)
}