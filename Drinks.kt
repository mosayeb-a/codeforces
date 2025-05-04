fun main() {
    val n = readln().toInt()
    val avg = readln().split(" ").sumOf { it.toDouble() } / n
    println("%.12f".format(avg))
}