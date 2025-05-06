fun main() {
    readln()
    val s = readln()
    val isPangram = s.lowercase().toSet().size == 26
    println(if (isPangram) "YES" else "NO")
}