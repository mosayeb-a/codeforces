fun main() {
    val n = readln().toInt()
    val soldiers = readln().split(" ").map { it.toInt() }

    val maxHeight = soldiers.max()
    val minHeight = soldiers.min()
    val maxIndex = soldiers.indexOf(maxHeight)
    val minIndex = soldiers.lastIndexOf(minHeight)

    var swaps = maxIndex + (n - 1 - minIndex)
    if (maxIndex > minIndex) {
        swaps--
    }

    println(swaps)
}