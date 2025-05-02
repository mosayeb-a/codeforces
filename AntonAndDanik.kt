fun main() {
    readln()
    val games = readln()

    val antonWins = games.count { it == 'A' }
    val danikWins = games.length - antonWins

    when {
        antonWins > danikWins -> println("Anton")
        danikWins > antonWins -> println("Danik")
        else -> println("Friendship")
    }
}