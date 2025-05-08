fun main() {
    readln()
    val groupSizes = readln().split(" ").map { it.toInt() }

    var ones = groupSizes.count { it == 1 }
    var twos = groupSizes.count { it == 2 }
    var threes = groupSizes.count { it == 3 }
    val fours = groupSizes.count { it == 4 }

    var taxis = fours

    val pairThreeOne = minOf(threes, ones)
    taxis += pairThreeOne
    threes -= pairThreeOne
    ones -= pairThreeOne

    taxis += threes

    taxis += twos / 2
    twos %= 2

    if (twos == 1) {
        taxis += 1
        ones -= minOf(2, ones)
    }

    if (ones > 0) {
        taxis += (ones + 3) / 4
    }

    println(taxis)
}
