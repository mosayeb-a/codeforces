fun main() {
    val coinsCount = readln().toInt()
    val coins = readln().split(" ").map { it.toInt() }.sortedDescending()

    var coinCounter = 0
    var mySum = 0
    val totalValue = coins.sum()

    for (i in 0 until coinsCount) {
        mySum += coins[i]
        coinCounter++
        if (mySum > totalValue - mySum) {
            break
        }
    }

    println(coinCounter)
}