fun main() {
    val s = readln()
    val target = "hello"
    var cursor = 0
    for (i in 0 until s.length) {
        if (s[i] == target[cursor]) {
            cursor++
            if (cursor == target.length) break
        }
    }
    println(if (cursor == target.length) "YES" else "NO")
}