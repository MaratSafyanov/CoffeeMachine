package machine

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    var amountWater = 400
    var amountMilk = 540
    var amountCoffee = 120
    var disposableCups = 9
    var amountMoney = 550


    do {
        print("Write action (buy, fill, take, r, exit): > ")
        val action = scanner.next()
        println()

        when (action) {

            "buy" -> {
                val number = buyAction()

                when (number) {

                    "1" -> {
                        if (amountWater - 250 > 0 && amountMilk >= 0 && amountCoffee - 16 > 0 && disposableCups > 0) {
                            amountWater = howMuchWaterIs(amountWater, 250)
                            amountMilk = howMuchMilkIs(amountMilk, 0)
                            amountCoffee = howMuchCoffeeIs(amountCoffee, 16)
                            disposableCups = howMuchCupsIs(disposableCups, 1)
                            amountMoney = howMuchMoneyIs(amountMoney, 4)
                            println("I have enough resources, making you a coffee!")
                            println()
                        } else if (amountWater - 250 < 0) {
                            println("Sorry, not enough water!")
                        } else if (amountCoffee - 16 < 0) {
                            println("Sorry, not enough coffee beans")
                        } else {
                            println("Sorry, not enough cups")
                        }
                    }
                    "2" -> {
                        if (amountWater - 350 > 0 && amountMilk - 75 >= 0 && amountCoffee - 20 > 0 && disposableCups > 0) {
                            amountWater = howMuchWaterIs(amountWater, 350)
                            amountMilk = howMuchMilkIs(amountMilk, 75)
                            amountCoffee = howMuchCoffeeIs(amountCoffee, 20)
                            disposableCups = howMuchCupsIs(disposableCups, 1)
                            amountMoney = howMuchMoneyIs(amountMoney, 7)
                            println("I have enough resources, making you a coffee!")
                            println()
                        } else if (amountWater - 350 < 0) {
                            println("Sorry, not enough water!")
                        } else if (amountMilk - 75 < 0) {
                            println("Sorry, not enough milk")
                        } else if (amountCoffee - 20 < 0) {
                            println("Sorry, not enough coffee beans")
                        } else {
                            println("Sorry, not enough cups")
                        }
                    }
                    "3" -> {
                        if (amountWater - 200 > 0 && amountMilk - 100 >= 0 && amountCoffee - 12 > 0 && disposableCups > 0) {
                            amountWater = howMuchWaterIs(amountWater, 200)
                            amountMilk = howMuchMilkIs(amountMilk, 100)
                            amountCoffee = howMuchCoffeeIs(amountCoffee, 12)
                            disposableCups = howMuchCupsIs(disposableCups, 1)
                            amountMoney = howMuchMoneyIs(amountMoney, 6)
                            println("I have enough resources, making you a coffee!")
                            println()
                        } else if (amountWater - 200 < 0) {
                            println("Sorry, not enough water!")
                        } else if (amountMilk - 100 < 0) {
                            println("Sorry, not enough milk")
                        } else if (amountCoffee - 12 < 0) {
                            println("Sorry, not enough coffee beans")
                        } else {
                            println("Sorry, not enough cups")
                        }
                    }

                    "back" -> println()
                }
            }
            "fill" -> {
                val water = fillWater(scanner) * -1
                val milk = fillMilk(scanner) * -1
                val coffeeBeans = fillCoffeeBeans(scanner) * -1
                val cups = fillCups(scanner) * -1
                amountWater = howMuchWaterIs(amountWater, water)
                amountMilk = howMuchMilkIs(amountMilk, milk)
                amountCoffee = howMuchCoffeeIs(amountCoffee, coffeeBeans)
                disposableCups = howMuchCupsIs(disposableCups, cups)
            }
            "take" -> {
                println("I gave you $$amountMoney")
                amountMoney = 0
                println()
            }
            "r" -> coffeeMachineHas(amountWater, amountMilk, amountCoffee, disposableCups, amountMoney)
        }
    } while (action != "exit")

}

fun buyAction(): String {

    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: > ")
    val scanner = Scanner(System.`in`)
    val number = scanner.next()
    return number
}

fun coffeeMachineHas(amountWater: Int, amountMilk: Int, amountCoffee: Int, disposableCups: Int, amountMoney: Int) {

    println("The coffee machine has:")
    println("$amountWater of water")
    println("$amountMilk of milk")
    println("$amountCoffee of coffee beans")
    println("$disposableCups of disposable cups")
    println("$amountMoney of money")
    println()
}

fun fillWater(scanner: Scanner):Int{
    print("Write how many ml of water do you want to add: > ")
    val water = scanner.nextInt()
    return water
}
fun fillMilk(scanner: Scanner):Int{
    print("Write how many ml of milk do you want to add: > ")
    val milk = scanner.nextInt()
    return milk
}
fun fillCoffeeBeans(scanner: Scanner):Int{
    print("Write how many grams of coffee beans do you want to add: > ")
    val coffeeBeans = scanner.nextInt()
    return coffeeBeans
}
fun fillCups(scanner: Scanner):Int{
    print("Write how many disposable cups of coffee do you want to add: > ")
    val cups = scanner.nextInt()
    return cups

}

fun howMuchWaterIs(amountWater: Int, waterInCoffee: Int): Int {
    val water = amountWater - waterInCoffee
    return water
}

fun howMuchMilkIs(amountMilk: Int, milkInCoffee: Int): Int {
    val milk = amountMilk - milkInCoffee
    return milk
}

fun howMuchCoffeeIs(amountCoffee: Int, coffeeBeansProCup: Int): Int {
    val coffeeBeans = amountCoffee - coffeeBeansProCup
    return coffeeBeans
}

fun howMuchCupsIs(amountCups: Int, cupsForCoffee: Int): Int {
    val cups = amountCups - cupsForCoffee
    return cups
}

fun howMuchMoneyIs(amountMoney: Int, moneyForCoffee: Int): Int {
    val money = amountMoney + moneyForCoffee
    return money
}


