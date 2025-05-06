fun main() {
    val testCaseCount = readln().toInt()
    for (i in 0 until testCaseCount) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        val remainder = a % b
        val moves = if (remainder == 0) 0 else b - remainder
        println(moves)
    }
}