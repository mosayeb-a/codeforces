fun main() {
    readln()
    val answers = readln().split(" ").map { it.toInt() }
    println(if (answers.contains(1)) "HARD" else "EASY")
}