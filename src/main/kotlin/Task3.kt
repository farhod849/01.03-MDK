fun task3()
{
    print("Постоянный ли клиент? (Да/Нет): ")
    val str = readln().lowercase()
    val constant = str=="да"
    print("Сумма покупки: ")
    var sum = readln().toFloat()
    var result = when(sum)
    {
        in 0f..1_000f -> sum
        in 1_001f..10_000f -> sum-100f
        else -> sum-sum*0.05f
    }
    result -= if(constant) result*0.01f else 0f
    println("Сумма составит $result")
}