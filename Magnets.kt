fun main() {
    val n = readln().toInt()
    var groups = 1
    var prev = readln()

    repeat(n - 1) {
        val current = readln()
        if (current != prev) {
            groups++
        }
        prev = current
    }

    println(groups)
}