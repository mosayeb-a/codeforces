fun main() {
    val n = readln().toInt()
    val result = buildString {
        for (i in 1..n) {
            append(if (i % 2 != 0) "I hate" else "I love")
            if (i != n) append(" that ") else append(" it")
        }
    }
    println(result)
}
