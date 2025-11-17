fun main() {
    val num1 = 1278217
    val result = ((1278217 % 100000) / 1000)
    println(result)

    val result2 = ((num1 / 100) % 10000)
    println(result2)

    val num2 = 238545
    val result3 = ((num2 / 1000) % 10 )
    println(result3)

    val result4 = (num2 / 10000)
    println(result4)

    val resul5 = ((num2 / 100000) + (num2 / 10000 % 10) + (num2 / 1000 % 10) + (num2 % 1000 / 100) +
            (num2 % 100 / 10) + (num2 % 10))
    println(resul5)
}