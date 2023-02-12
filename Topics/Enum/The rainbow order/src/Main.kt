fun main() {
    val color = readln().uppercase()
    println(Rainbow.valueOf(color).ordinal + 1)
}

enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}