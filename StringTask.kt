
import java.util.*

fun main() {
    val vowels = listOf('A', 'O', 'Y', 'E', 'U', 'I')
    fun isVowel(char: Char): Boolean {
        for (v in vowels) {
            if (v.lowercase() == char.lowercase()) return true
        }
        return false
    }
    val scanner = Scanner(System.`in`)
    val word = scanner.next()
    var finalWord = ""
    for (char in word) {
        if (!isVowel(char)) {
            finalWord += ".${char.lowercase()}"
        }
    }
    println(finalWord)
}


/*
fun main() {
    val vowels = setOf('a', 'o', 'y', 'e', 'u', 'i') // Use lowercase for direct comparison
    val scanner = java.util.Scanner(System.`in`)
    val word = scanner.next()

    val finalWord = word
        .filter { !vowels.contains(it.lowercaseChar()) } // Filter out vowels
        .map { ".${it.lowercaseChar()}" } // Add a dot and convert to lowercase
        .joinToString("") // Join the list into a single string

    println(finalWord)
}
 */