fun main() {
    val testCaseCount = readln().toInt()
    var current = 0
    var maxCapacity = 0
    repeat(testCaseCount) {
        val (exit, enter) = readln().split(" ").map { it.toInt() }
        current -= exit
        current += enter
        maxCapacity = maxOf(maxCapacity, current)
    }
    println(maxCapacity)
}