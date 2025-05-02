import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.next()
    var upperCaseCounter = 0;
    for (char in word) {
        if (char.isUpperCase()) {
            upperCaseCounter++;
        }
    }
    val lowercaseCount = word.length - upperCaseCounter
    if (upperCaseCounter == lowercaseCount) {
        println(word.lowercase())
    } else if (upperCaseCounter > lowercaseCount) {
        println(word.uppercase())
    } else {
        println(word.lowercase())
    }
}
/*
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.next()

    val upperCaseCounter = word.count { it.isUpperCase() }
    val lowercaseCount = word.length - upperCaseCounter

    val result = when {
        upperCaseCounter == lowercaseCount -> word.lowercase()
        upperCaseCounter > lowercaseCount -> word.uppercase()
        else -> word.lowercase()
    }

    println(result)
}
 */