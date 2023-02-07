package machine

const val WATER_PER_CUP = 200
const val MILK_PER_CUP = 50
const val COFFEE_BEANS_PER_CUP = 15

fun main() {
    println("Write how many cups of coffee you will need:")
    val cups = readln().toInt()
    println(
        """For $cups cups of coffee you will need:
${cups * WATER_PER_CUP} ml of water
${cups * MILK_PER_CUP} ml of milk
${cups * COFFEE_BEANS_PER_CUP} g of coffee beans"""
    )
}
