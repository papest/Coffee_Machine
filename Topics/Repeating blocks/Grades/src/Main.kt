const val A = 5
const val B = 4
const val C = 3
const val D = 2

fun main() {

    var countD = 0
    var countA = 0
    var countB = 0
    var countC = 0

    repeat(readln().toInt()) {
        when (readln().toInt()) {
            A -> countA++
            B -> countB++
            C -> countC++
            D -> countD++
        }
    }

    println("$countD $countC $countB $countA")

}