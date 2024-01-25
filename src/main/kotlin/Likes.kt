import java.util.*

fun main(args: Array<String>) {
    print("Введите число лайков под постом: ")
    val string = readln().toCharArray()
    val result = if (string[string.lastIndex] == '1') "человеку" else "людям"
    println("Понравилось ${string.concatToString()} $result")

}