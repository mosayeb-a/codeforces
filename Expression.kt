fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val results = listOf(
        a + b + c,
        a + b * c,
        a * b + c,
        a * b * c,
        (a + b) * c,
        a * (b + c)
    )

    println(results.max())
}