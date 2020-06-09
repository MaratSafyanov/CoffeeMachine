import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val num1 = scanner.next().toLong()
    val oper = scanner.next()
    val num2 = scanner.next().toLong()

    if (num2.toString() == "0" && oper == "/")
        println("Division by 0!")
    else {

        when (oper) {
            "+" -> println(num1 + num2)
            "-" -> println(num1 - num2)
            "*" -> println(num1 * num2)
            "/" -> println(num1 / num2)
            else -> println("Unknown operator")

        }
    }
}