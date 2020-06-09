/*
Code Challenge — Write a program
This task will show you some functions of strings. You may already know them. Anyway, it will be great if you solve this problem!
The task here is to decode a string:
If the string's first symbol is i, remove the first symbol. The string will contain a number. Print the number + 1.
If the string's first symbol is s, remove the first symbol. Then print the reversed remainder.
Otherwise, just print the unchanged string.
Here are string functions that you can use:

.first() returns the first symbol of the string.
.isEmpty() returns true, if the string has no symbols, otherwise, it returns false.
.drop(n) removes n first symbols from the string and returns the resulting string.
.reversed() returns the reversed string.
.toInt() converts the string to an integer and returns it.

You should output results using the println function.
Sample Input 1:
i123
Sample Output 1:
124
*/
fun main() {
    /*val input = readLine()!!
    if (input.isEmpty())
        println()
    else {
        if (input.first() == 'i') {
            val dropI = input.drop(1)
            dropI.intOrString()

        } else if (input.first() == 's') {

            println(input.drop(1).reversed())
        } else {
            println(input)
        }
    }*/



    /*val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)*/








}

fun String.intOrString(): Any {
    val value = toIntOrNull()
    return when (value) {
        null -> println(this)
        else -> println(value + 1)
    }
}

class Point3D {
    var x: Int = 0
    var y: Int = 0
    var z: Int = 0
}

fun createPoint(x: Int, y: Int, z: Int): Point3D {
    var point = Point3D()
    point.x = x
    point.y = y
    point.z = z
    return point
}

class City(val name: String) {
    var population: Int = 0
        get() = field
        set(value) {
            if (value < 0) {
                field = 0
            } else if (value > 50_000_000) {
                field = 50_000_000
            } else {
                field = value
            }
        }
}

class ByteTimer(var time: Int) {
    init {
        if (time < -128)
            time = -128
        else if (time > 127)
            time = 127
        else
            time = time

    }

}
object PlayingField{

    object Size{

        val width: Int = 0
        val height: Int = 0

        fun changeSize(width: Int, height: Int) {

            var newWidth = width
            var newHeight = height

            var size = newWidth * newHeight
            if (size < 0) {
                size = 0
            }

        }
    }
}
