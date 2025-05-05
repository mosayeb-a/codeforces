fun main() {
    val colors = readln().split(" ").map { it.toInt() }
    print(colors.size - colors.distinct().size)
}