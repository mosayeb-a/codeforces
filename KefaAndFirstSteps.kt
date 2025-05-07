fun main() {
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }

    var maxLength = 1
    var counter = 1

    for (i in 1 until n) {
        if (nums[i] >= nums[i - 1]) {
            counter++
        } else {
            counter = 1
        }
        maxLength = maxOf(maxLength, counter)
    }

    println(maxLength)
}