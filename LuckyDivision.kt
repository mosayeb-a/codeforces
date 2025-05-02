fun isLuckyNumber(n: Int): Boolean {
    return n.toString().all { it == '4' || it == '7' }
}
fun main() {
    val num = readln().toInt()
    val result = (1..num).any { isLuckyNumber(it) && num % it == 0 }
    println(if (result) "YES" else "NO")
}
