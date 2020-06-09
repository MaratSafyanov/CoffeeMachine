/*
Let's redesign our program and write a class that represents the coffee machine. The class should have a method that takes a string as input.
 Every time the user inputs a line (a string) to the console, the program invokes this method with one argument: the line that user input to the console.
  This system simulates pretty accurately how real-world electronic devices work. External components (like buttons on the coffee machine or tapping
  on the screen) generate events that pass into the single interface of the program.
The class should not use system input at all; it only should handle input that comes to it via this method and its string argument.
The first problem that comes to mind: how to write that method in a way that it represents all that coffee machine can do?
If the user inputs a single number, how can the method determine what that number is: a variant of coffee chosen by the user or the
number of the disposable cups that a special worker added into the coffee machine?
The right solution to this problem is to store the current state of the machine. The coffee machine has several states it can be in.
For example, the state could be "choosing an action" or "choosing a variant of coffee".
Every time the user inputs something and a program passes that line to the method, the program determines how to interpret this line using
the information about the current state. After processing this line, the state of the coffee machine can be changed or can stay the same.
The most efficient way of handling states is using an enum with all predefined states.

*/


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


