fun main() {
    val levelCounts = readln().toInt()
    val levelsCanPassByX = readln().split(" ").drop(1).map { it.toInt() }
    val levelsCanPassByY = readln().split(" ").drop(1).map { it.toInt() }

    val canPass = (levelsCanPassByX + levelsCanPassByY).toSet().size == levelCounts
    println(if (canPass) "I become the guy." else "Oh, my keyboard!")
}