fun main() {
    averageOfEven()
    isSymmetric()
    continueKeyWord()
    searching()
    firstNumber()
}

/*
1.Ekrandan daxil edilmiş ededin cut reqemlerinin ededi ortasını tapin(While ile)
*/
fun averageOfEven() {
    var number = readln().toInt()
    var mean = 0
    var sum = 0
    var count = 0

    while (number > 0) {
        val temp = number % 10
        if (temp % 2 == 0) {
            sum += temp
            count++
        }
        number /= 10
    }
    mean = sum / count
    println(mean)
}

/*
2.Ekrandan reqemlerinin sayı tek olan eded dahil edilir.Hemin ededin sag ve
solunun beraber olup olmadigini yollayın
Numune:121 1=1   1234123 123=123
*/

fun isSymmetric() {
    var number = readln().toInt()
    var temp = number
    var count = 0

    while (temp > 0) {
        count++
        temp /= 10
    }

    if (count % 2 == 0) {
        println("Error")
        return
    }
    temp = number
    count /= 2
    var rightResult = 0
    for (index in 0..<count) {
        val value = temp % 10
        rightResult = rightResult * 10 + value
        temp /= 10
    }

    var leftResult = 0
    temp /= 10
    for (index2 in 0..<count) {
        val value = temp % 10
        leftResult = leftResult * 10 + value
        temp /= 10
    }
    if (leftResult == rightResult) {
        println("Symmetric")
        return
    }
    println("Not symmetric")
}

/*
3.1-1000 kimi ededlerin 3 ve 8 bölünen ededleri nezere almayin(continue)
*/

fun continueKeyWord() {
    for (item in 1..1000) {
        if (item % 3 == 0 && item % 8 == 0) {
            continue
        }
        println(item)
    }

}

/*
4.1-1000 kimi ededlerin hasili reqemlerinin cemi 20 -den boyuk olan hali tapana kimi davam etsin(break)
*/

fun searching() {
    var multiplication = 1
    for (item in 1..1000) {
        multiplication *= item
        var temp = multiplication
        var sum = 0
        while (temp > 0) {
            sum += temp % 10
            temp /= 10
        }
        if (sum > 20) {
            println("Eded:${item}, Hasil: ${multiplication}, Cem:${sum}")
            break
        }
    }

}

/*
5.1-1000 kimi ededlerin kvadratlari 600-dan boyuk olduqda
ilk hemin ededi versin(break)
*/

fun firstNumber() {
    for (item in 1..1000) {
        if (item * item > 600) {
            println(item)
            break
        }
    }
}