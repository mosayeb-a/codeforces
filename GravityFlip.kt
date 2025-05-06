fun main() {
    readln()
    val result = readln().split(" ").map { it.toInt() }.sorted()
    println(result.joinToString(" "))
}