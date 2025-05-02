fun hasDistinctDigits(year: Int): Boolean =
    year.toString().toSet().size == 4

fun main() {
    val year = readln().toInt()
    val nextDistinctYear = generateSequence(year + 1) { it + 1 }
            .first { hasDistinctDigits(it) }
    println(nextDistinctYear)
}