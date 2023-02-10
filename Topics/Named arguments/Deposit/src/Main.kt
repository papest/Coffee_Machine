import kotlin.math.pow

@SuppressWarnings("MagicNumber")
fun finalAmount(amount: Int = 1000, percent: Int = 5, years: Int = 10): Long {
    return (amount * (1 + percent.toDouble() / 100).pow(years)).toLong()
}

fun main() {
    val parameterName = readln()
    val value = readln().toInt()
    println(
        when (parameterName) {
            "amount" -> finalAmount(amount = value)
            "percent" -> finalAmount(percent = value)
            "years" -> finalAmount(years = value)
            else -> finalAmount()
        }
    )
}
