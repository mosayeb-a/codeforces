fun main() {
    val string = readln()
    var zeroCounter = 0
    var oneCounter = 0
    for (char in string) {
        if (char == '0') {
            if (oneCounter >= 7) {
                println("YES")
                return
            }
            oneCounter = 0
            zeroCounter++
        } else if (char == '1') {
            if (zeroCounter >= 7) {
                println("YES")
                return
            }
            zeroCounter = 0
            oneCounter++
        }
    }

    if (zeroCounter >= 7 || oneCounter >= 7) {
        println("YES")
    } else {
        println("NO")
    }
}
