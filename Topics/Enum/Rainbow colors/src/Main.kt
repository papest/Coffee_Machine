fun main() {
    println(isRainbow(readln().uppercase()))
}

enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun isRainbow(color: String): Boolean {
    for (element in Rainbow.values()) {
        if (element.name == color) {
            return true
        }
    }
    return false
}