fun main() {
    val (_, fenceHeight)  = readln().split(" ").map { it.toInt() }
    val heights = readln().split(" ").map { it.toInt() }

    var width = 0
    for (height in heights){
        width += if (height > fenceHeight) 2 else 1
    }
    println(width)
}