fun main() {
    val num = readln()
    var luckyDigitCount = 0

    for (char in num) {
        if (char == '4' || char == '7') {
            luckyDigitCount++
        }
    }

    if (luckyDigitCount == 4 || luckyDigitCount == 7) {
        println("YES")
    } else {
        println("NO")
    }
}