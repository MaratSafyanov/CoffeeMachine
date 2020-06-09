package machine

import java.util.*

enum class CoffeуTypes(val water: Int, val milk: Int, val coffeeBeans: Int, val cups: Int, val money: Int) {
    ESPRESSO(250, 0, 16, 1, 4),
    LATTE(350, 75, 20, 1, 7),
    CAPPUCCINO(200, 100, 12, 1, 6);

    fun buyCoffee(coffeeMachineState: CoffeeMachineIngred): CoffeeMachineIngred {

        when {
            coffeeMachineState.water < this.water -> println("Sorry, not enough water")
            coffeeMachineState.milk < this.milk -> println("Sorry, not enough milk")
            coffeeMachineState.coffeeBeans < this.coffeeBeans -> println("Sorry, not enough coffee beans")
            coffeeMachineState.cups < this.cups -> println("Sorry, not enough cups")
            else -> {
                println("I have enough resources, making you a coffee")
                coffeeMachineState.water -= this.water
                coffeeMachineState.milk -= this.milk
                coffeeMachineState.coffeeBeans -= this.coffeeBeans
                coffeeMachineState.cups -= this.cups
                coffeeMachineState.money += this.money
            }
        }
        return coffeeMachineState
    }
}

class CoffeeMachine(var start: CoffeeMachineIngred) {

    fun getInput(input: String) {

        when (input) {

            "buy" -> {
                val number = buyAction()
                when (number) {

                    "1" -> CoffeуTypes.ESPRESSO.buyCoffee(start)
                    "2" -> CoffeуTypes.LATTE.buyCoffee(start)
                    "3" -> CoffeуTypes.CAPPUCCINO.buyCoffee(start)
                    "back" -> println()
                }
            }
            "fill" -> {
                val scanner = Scanner(System.`in`)
                print("Write how many ml of water do you want to add: ")
                val water = scanner.nextInt()
                print("Write how many ml of milk do you want to add: ")
                val milk = scanner.nextInt()
                print("Write how many grams of coffee beans do you want to add: ")
                val coffeeBeans = scanner.nextInt()
                print("Write how many disposable cups of coffee do you want to add: ")
                val cups = scanner.nextInt()
                start = CoffeeMachineIngred(
                    water + start.water,
                    milk + start.milk,
                    coffeeBeans + start.coffeeBeans,
                    cups + start.cups,
                    start.money
                )
            }
            "take" -> {
                println("I gave you $${start.money}")
                start.money = 0
            }
            "remaining" -> {
                println("The coffee machine has:")
                println("${start.water} of water")
                println("${start.milk} of milk")
                println("${start.coffeeBeans} of coffee beans")
                println("${start.cups} of disposable cups")
                println("${start.money} of money")
                println()
            }
        }
    }
}

data class CoffeeMachineIngred(var water: Int, var milk: Int, var coffeeBeans: Int, var cups: Int, var money: Int) {}

fun main() {
    val scanner = Scanner(System.`in`)
    var start = CoffeeMachineIngred(400, 540, 120, 9, 550)
    val coffeeMachine = CoffeeMachine(start)
    do {
        print("Write action (buy, fill, take, remaining, exit): ")
        val input = scanner.next()
        coffeeMachine.getInput(input)
    } while (input != "exit")

}

fun buyAction(): String {
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
    val scanner = Scanner(System.`in`)
    val number = scanner.next()
    return number
}


