fun main() {
    val friendsCount = readln().toInt()
    val friends = readln().split(" ").map { it.toInt() }
    val result = IntArray(friendsCount)
    for (i in 0 until friendsCount) {
        val recipient = friends[i]
        result[recipient - 1] = i + 1
    }

    println(result.joinToString(" "))
}