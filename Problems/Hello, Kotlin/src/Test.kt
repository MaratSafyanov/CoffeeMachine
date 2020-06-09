/*
package machine

import java.util.*

//fun main() {
    val scanner = Scanner(System.`in`)
    print("Write how many ml of water the coffee machine has: > ")
    val amountWater = scanner.nextInt()
    print("Write how many ml of milk the coffee machine has: > ")
    val amountMilk = scanner.nextInt()
    print("Write how many grams of coffee beans the coffee machine has: > ")
    val amountCoffee = scanner.nextInt()
    print("Write how many cups of coffee you will need: > ")
    val cupsOfCoffee = scanner.nextInt()

    var canMakeCups = 0

    val water = 200
    val milk = 50
    val coffeeBeans = 15

    val waterInCups = amountWater / water
    val milkInCups = amountMilk / milk
    val coffeeInCups = amountCoffee / coffeeBeans

    canMakeCups = findMin(waterInCups, milkInCups, coffeeInCups)

    if (canMakeCups == cupsOfCoffee)
        println("Yes, I can make that amount of coffee")
    else if (canMakeCups > cupsOfCoffee)
        println("Yes, I can make that amount of coffee (and even ${canMakeCups - cupsOfCoffee} more than that)")
    else
        println("No, I can make only $canMakeCups cups of coffee")

}


fun findMin(water:Int, milk:Int, coffee:Int):Int{

    if (water <= milk && water <= coffee)
        return  water
    else if (milk <= coffee)
        return  milk
    else return coffee
}





//  Task #4


//package machine

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val amountWater = 400
    val amountMilk = 540
    val amountCoffee = 120
    val disposableCups = 9
    val amountMoney = 550

    coffeeMachineHas(amountWater, amountMilk, amountCoffee, disposableCups, amountMoney)

    print("Write action (buy, fill, take): > ")
    val action = scanner.next()

    when (action) {

        "buy" -> buyAction(amountWater, amountMilk, amountCoffee, disposableCups, amountMoney)
        "fill" -> fillCoffeeMachine(amountWater, amountMilk, amountCoffee, disposableCups, amountMoney)
        "take" -> {
            println("I gave you $$amountMoney")
            println()
            coffeeMachineHas(amountWater, amountMilk, amountCoffee, disposableCups, 0)
        }
    }

    println()

}


fun findMin(water: Int, milk: Int, coffee: Int): Int {

    if (water <= milk && water <= coffee)
        return water
    else if (milk <= coffee)
        return milk
    else return coffee
}

fun buyAction(water: Int, milk: Int, coffeeBeans: Int, cups: Int, money: Int) {

    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: > ")
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()

    when (number) {
        1 -> coffeeMachineHas(water - 200, milk, coffeeBeans - 16, cups - 1, money + 4)
        2 -> coffeeMachineHas(water - 350, milk - 75, coffeeBeans - 20, cups - 1, money + 7)
        3 -> coffeeMachineHas(water - 200, milk - 100, coffeeBeans - 12, cups - 1, money + 6)
    }

}

fun coffeeMachineHas(amountWater: Int, amountMilk: Int, amountCoffee: Int, disposableCups: Int, amountMoney: Int) {

    println("The coffee machine has:")
    println("$amountWater of water")
    println("$amountMilk of milk")
    println("$amountCoffee of coffee beans")
    println("$disposableCups of disposable cups")
    println("$amountMoney of money")

}

fun fillCoffeeMachine(amountWater: Int, amountMilk: Int, amountCoffee: Int, disposableCups: Int, amountMoney: Int){
    val scanner = Scanner(System.`in`)
    print("Write how many ml of water do you want to add: > ")
    val water = scanner.nextInt()
    print("Write how many ml of milk do you want to add: > ")
    val milk = scanner.nextInt()
    print("Write how many grams of coffee beans do you want to add: > ")
    val coffeeBeans = scanner.nextInt()
    print("Write how many disposable cups of coffee do you want to add: > ")
    val cups = scanner.nextInt()

    coffeeMachineHas(water + amountWater, milk + amountMilk,
        coffeeBeans + amountCoffee, cups + disposableCups, amountMoney)
}



*/
