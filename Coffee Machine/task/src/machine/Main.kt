package machine

const val WATER_INDEX = 0
const val MILK_INDEX = 1
const val COFFEE_BEANS_INDEX = 2
const val MONEY_INDEX = 3

var water = 400
var milk = 540
var coffeeBeans = 120
var disposableCups = 9
var money = 550
val espresso = mutableListOf(250, 0, 16, 4)
val latte = mutableListOf(350, 75, 20, 7)
val cappuccino = mutableListOf(200, 100, 12, 6)
val coffee = mutableListOf(espresso, latte, cappuccino)

fun printCoffeeMachineState() {
    println(
        """The coffee machine has:
$water ml of water
$milk ml of milk
$coffeeBeans g of coffee beans
$disposableCups disposable cups
$$money of money"""
    )
}

fun buy() {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
    val choice = readln().toInt()
    water -= coffee[choice - 1][WATER_INDEX]
    milk -= coffee[choice - 1][MILK_INDEX]
    coffeeBeans -= coffee[choice - 1][COFFEE_BEANS_INDEX]
    disposableCups--
    money += coffee[choice - 1][MONEY_INDEX]

}

fun fill() {
    println("Write how many ml of water you want to add:")
    water += readln().toInt()
    println("Write how many ml of milk you want to add:")
    milk += readln().toInt()
    println("Write how many grams of coffee beans you want to add:")
    coffeeBeans += readln().toInt()
    println("Write how many disposable cups you want to add:")
    disposableCups += readln().toInt()

}

fun take() {
    println("I gave you $$money")
    money = 0

}

fun main() {
    printCoffeeMachineState()
    println("Write action (buy, fill, take):")
    when (readln()) {
        "buy" -> buy()
        "fill" -> fill()
        "take" -> take()
    }
    printCoffeeMachineState()

}
