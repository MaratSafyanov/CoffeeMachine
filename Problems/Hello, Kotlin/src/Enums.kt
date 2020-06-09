import java.lang.IllegalArgumentException
import java.util.*

enum class DangerLevel(val lvl: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel(): Int {

        return lvl
    }


}

fun main() {

    /*val high = DangerLevel.HIGH
    val medium = DangerLevel.MEDIUM
    val low = DangerLevel.LOW

    println(high.getLevel())
    println(medium.getLevel())
    println(low.getLevel())*/

    val input = Scanner(System.`in`)
    val country1 = input.next()
    val country2 = input.next()
    println(Countries.check(country1, country2))


    /*val name1 = Countries.valueOf(country1)
    val name2 = Countries.valueOf(country2)

    if (name1 == enum && name2 == enum) {
        println(name1.getCur() == name2.getCur())
    } else
        println(false)
*/
    //println(high.getLevel() > medium.getLevel())
}

enum class Countries(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar");

    companion object {
        fun check(country1: String, country2: String): Boolean {
            return (values().find { it.name == country1 }?.currency
                    == values().find { it.name == country2 }?.currency)
        }
    }

}