fun main() {
    val n1 = readln()
    val n2 = readln()

    for (i in 0 until n1.length) {
        if (n1[i] == n2[i]) print("0") else print("1")
    }
}