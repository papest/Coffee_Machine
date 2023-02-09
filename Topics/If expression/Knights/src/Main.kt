import kotlin.math.abs

const val KNIGHT1 = 2
const val KNIGHT2 = 1

fun main() {
    val (readX1, readY1) = readln().split(" ")
    val (readX2, readY2) = readln().split(" ")
    val x1 = readX1.toInt()
    val y1 = readY1.toInt()
    val x2 = readX2.toInt()
    val y2 = readY2.toInt()
    println(
        if (abs(x1 - x2) == KNIGHT1 && abs(y1 - y2) == KNIGHT2 ||
            abs(y1 - y2) == KNIGHT1 && abs(x1 - x2) == KNIGHT2
        ) {
            "YES"
        } else {
            "NO"
        }
    )
}