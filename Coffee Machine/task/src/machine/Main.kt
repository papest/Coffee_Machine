package machine

const val WATER_PER_CUP = 200
const val MILK_PER_CUP = 50
const val COFFEE_BEANS_PER_CUP = 15

fun main() {
    println("Write how many ml of water the coffee machine has:")
    val water = readln().toInt()
    println("Write how many ml of milk the coffee machine has:")
    val milk = readln().toInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    val coffeeBeans = readln().toInt()
    println("Write how many cups of coffee you will need:")
    val cups = readln().toInt()
    val maxCups =
        (water / WATER_PER_CUP).coerceAtMost(milk / MILK_PER_CUP).coerceAtMost(coffeeBeans / COFFEE_BEANS_PER_CUP)
    when {
        cups == maxCups -> {
            println("Yes, I can make that amount of coffee")
        }
        cups > maxCups -> {
            println("No, I can make only $maxCups cups of coffee")
        }
        maxCups > cups -> {
            println("Yes, I can make that amount of coffee (and even ${maxCups - cups} more than that)")
        }

    }
}

