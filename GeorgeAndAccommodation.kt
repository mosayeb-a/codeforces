// functional approach
fun main() {
    val roomsCount = readln().toInt()
    val count = (1..roomsCount)
        .count {
            val (livingPeopleCount, roomCapacity) = readln().split(" ").map { it.toInt() }
            roomCapacity - livingPeopleCount >= 2
        }
    println(count)
}

// fun main() {
//    val roomsCount = readln().toInt()
//    var roomCounter = 0
//    for (i in 0 until roomsCount) {
//        val (livingPeopleCount, roomCapacity) = readln().split(" ").map { it.toInt() }
//        val finalCapacity = roomCapacity - livingPeopleCount
//        if (finalCapacity >= 2) {
//            roomCounter++
//        }
//    }
//    println(roomCounter)
//}