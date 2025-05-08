fun main() {
    val n = readln().toInt()

    val uniforms = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val (home, guest) = readln().split(" ").map { it.toInt() }
        uniforms.add(Pair(home, guest))
    }

    var counter = 0
    for (i in uniforms.indices) {
        for (j in uniforms.indices) {
            if (i != j && uniforms[i].first == uniforms[j].second) {
                counter++
            }
        }
    }

    println(counter)
}