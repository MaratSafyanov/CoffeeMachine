import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    var temp = 0
    var count = num

    while (count > 0) {

        temp++
        if ((count - temp) > 0) {
            repeat(temp) {
                print("$temp ")
                count--
            }
        }else{
            repeat(count){
                print("$temp ")
                count--
            }
        }

    }
}
