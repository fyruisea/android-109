fun main() {
    val num1 = 1278217
    val result = ((1278217 % 100000) / 1000)
    println(result)

    val result2 = ((num1 / 100) % 10000)
    println(result2)

    val num2 = 238545
    val result3 = ((num2 / 1000) % 10)
    println(result3)

    val result4 = (num2 / 10000)
    println(result4)

    val resul5 = ((num2 / 100000) + (num2 / 10000 % 10) + (num2 / 1000 % 10) + (num2 % 1000 / 100) +
            (num2 % 100 / 10) + (num2 % 10))
    println(resul5)




    /*
    1.238545 ədədində ədədləri iki-iki mod və div əməliyyatlarından istifadə edərək tapin
    və onlarin cemini tapin.(Numune:23+85+45)
    */

    val number1 = 238545
    val newNumber1 = (238545 / 10000) + (238545 / 100 % 100) + (238545 % 100)
    println(newNumber1)


    /*
    2.3423432 ədədində son iki və ilk ədədi mod və div əməliyyatlarından istifadə edərək tapin
    və onlarin cemini tapin.(Numune:34+32)
    */

    val number2 = 3423432
    val newNumber2 = (3423432 / 100000) + (3423432 % 100)
    println(newNumber2)

    /*
    3.342 343 2 ədədində 343 ədədini mod və div əməliyyatlarından istifadə edərək ekrana cixardin.
    */

    val newNumber3 = (3423432 % 10000) / 10
    println(newNumber3)

    /*
    4.9423435 ədədində ilk və son ədədi mod və div əməliyyatlarından istifadə edərək tapın
    və onlarin cemini ekrana cixardin (Numune:9+5)
    */

    val number3 = 9423435
    val newNumber4 = (9423435 / 1000000) + (9423435 % 10)
    println(newNumber4)

    /*
    5.9423435 ədədində hər bir ədədi mod və div əməliyyatlarından istifadə edərək tapin
    və onlarin ədədi ortasını tapin.
    */

    val newNumber5 = (9423435 / 1000000) + (9423435 / 100000) % 10 + (9423435 / 10000) % 10 +
            (9423435 / 1000) % 10 + (9423435 / 100) % 10 +(9423435 % 10) + (9423435 / 10) % 10
    val mean = newNumber5 / 7
    println(mean)

}