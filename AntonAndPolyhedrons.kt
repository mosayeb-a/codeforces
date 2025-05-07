fun main() {
    val cubesCount = readln().toInt()

    val cubes = mapOf(
        "Tetrahedron" to 4,
        "Cube" to 6,
        "Octahedron" to 8,
        "Dodecahedron" to 12,
        "Icosahedron" to 20
    )
    var counter = 0
    repeat(cubesCount) {
        val cube = readln()
        counter += cubes[cube]!!
    }
    println(counter)
}