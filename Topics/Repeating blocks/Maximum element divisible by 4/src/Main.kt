@SuppressWarnings("MagicNumber")
fun main() {

    var maxDivisibleBy4 = 0

    repeat(readln().toInt()) {
        val number = readln().toInt()
        if (number % 4 == 0 && number > maxDivisibleBy4) {
            maxDivisibleBy4 = number
        }
    }
    println(maxDivisibleBy4)

}