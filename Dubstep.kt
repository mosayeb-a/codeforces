fun main() {
    val result = readln()
        .split("WUB")
        .filter { it.isNotEmpty() }
        .joinToString(" ")
    println(result)
}