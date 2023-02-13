package machine

const val WATER_INDEX = 0
const val MILK_INDEX = 1
const val COFFEE_BEANS_INDEX = 2
const val MONEY_INDEX = 3

class CoffeeMachine(
    private var water: Int = 400,
    private var milk: Int = 540,
    private var coffeeBeans: Int = 120,
    private var disposableCups: Int = 9,
    private var money: Int = 550
) {
    private val espresso = mutableListOf(250, 0, 16, 4)
    private val latte = mutableListOf(350, 75, 20, 7)
    private val cappuccino = mutableListOf(200, 100, 12, 6)
    private val coffee = mutableListOf(espresso, latte, cappuccino)
    fun menu() {

        while (true) {

            println("Write action (buy, fill, take, remaining, exit):")
            when (readln()) {
                "buy" -> buy()
                "fill" -> fill()
                "take" -> take()
                "remaining" -> printCoffeeMachineState()
                "exit" -> return
            }
        }
    }

    private fun printCoffeeMachineState() {
        println(
            """The coffee machine has:
$water ml of water
$milk ml of milk
$coffeeBeans g of coffee beans
$disposableCups disposable cups
$$money of money"""
        )
    }

    private fun checkSupplies(choice: Int): String {

        if (coffee[choice - 1][WATER_INDEX] > water) return "water"
        if (coffee[choice - 1][MILK_INDEX] > milk) return "milk"
        if (coffee[choice - 1][COFFEE_BEANS_INDEX] > coffeeBeans) return "coffee beans"
        return "OK"

    }

    private fun buy() {

        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
        val readString = readln()
        if (readString == "back") {
            return
        }
        val choice = readString.toInt()
        val checkSupplies = checkSupplies(choice)
        if (checkSupplies !== "OK") {
            println("Sorry, not enough $checkSupplies!")
            return
        }
        water -= coffee[choice - 1][WATER_INDEX]
        milk -= coffee[choice - 1][MILK_INDEX]
        coffeeBeans -= coffee[choice - 1][COFFEE_BEANS_INDEX]
        disposableCups--
        money += coffee[choice - 1][MONEY_INDEX]
        println("I have enough resources, making you a coffee!")

    }

    private fun fill() {

        println("Write how many ml of water you want to add:")
        water += readln().toInt()
        println("Write how many ml of milk you want to add:")
        milk += readln().toInt()
        println("Write how many grams of coffee beans you want to add:")
        coffeeBeans += readln().toInt()
        println("Write how many disposable cups you want to add:")
        disposableCups += readln().toInt()

    }

    private fun take() {

        println("I gave you $$money")
        money = 0

    }

}

fun main() {

    val coffeeMachine = CoffeeMachine()
    coffeeMachine.menu()

}
