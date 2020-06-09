import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var number = scanner.nextInt()

    while (number != 1)

        if (number % 2 == 0) {
            print("$number ")
            number /= 2
        } else {
            print("$number ")
            number = number * 3 + 1
        }

    print(1)

}