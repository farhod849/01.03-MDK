import java.util.Scanner

fun main(args: Array<String>) {
    println("Введите сумму перевода (не менее 35 рублей, комиссия 0.75%")
    val sc = Scanner(System.`in`)
    var amount: Int = sc.nextInt();
    val result = if (amount >= 35) amount * (0.75/100)  else println("Надо ввести больше 35-ти рублей")
    println("Ваша комиссия: " + result)
}