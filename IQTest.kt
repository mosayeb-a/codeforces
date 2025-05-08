fun main() {
    readln()
    val nums = readln().split(" ").map { it.toInt() }

    val evenCount = nums.take(3).count { it % 2 == 0 }
    val majorityIsEven = evenCount >= 2

    val index = nums.indexOfFirst {
        if (majorityIsEven) it % 2 != 0 else it % 2 == 0
    }

    println(index + 1)
}
