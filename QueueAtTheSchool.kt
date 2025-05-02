fun main() {
    val (numberOfChildren, time) = readln().split(" ").map { it.toInt() }
    val queue = readln().toMutableList()

    for (t in 0 until time) {
        var i = 0
        while (i < queue.size - 1) {
            if (queue[i] == 'B' && queue[i + 1] == 'G') {
                val temp = queue[i]
                queue[i] = queue[i + 1]
                queue[i + 1] = temp
                i++
            }
            i++
        }
    }

    println(queue.joinToString(""))
}
