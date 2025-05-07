fun main() {
    var n = readln().toInt()
    var counter = 0
    val denominations = listOf(100, 20, 10, 5, 1)

    for (coin in denominations) {
        counter += n / coin
        n %= coin
    }
    println("$counter")
}