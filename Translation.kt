fun main() {
    fun isReversed(w: String, t: String): Boolean {
        var reversedW = ""
        for (i in w.length - 1 downTo 0) {
            reversedW += w[i]
        }

        return reversedW == t
    }

    val w = readln()
    val t = readln()

    if (isReversed(w, t)) {
        println("YES")
    } else {
        println("NO")
    }

}