fun main() {
    val (n, k) = readln().split(" ").map { it.toLong() }

    val oddCount = (n + 1) / 2
    val result = if (k <= oddCount) {
        2 * k - 1
    } else {
        2 * (k - oddCount)
    }

    println(result)
}