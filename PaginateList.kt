fun <T> paginate(
    list: List<T>,
    page: Int,
    itemCount: Int = 10,
): List<T> {
    val offset = page * itemCount
    if (offset >= list.size) return emptyList()
    val endIndex = minOf(offset + itemCount, list.size)
    return list.subList(offset, endIndex)
}

fun main() {
    val list = List(35) { "item-> $it" }

    val page = 2
    val pageItems = paginate(list, page)

    println("page $page:")
    pageItems.forEach { println(it) }
}