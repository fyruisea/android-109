fun main() {
    /*
    1.100-1000 araliginda butun reqemleri tekrar olan ededlerin ededi ortasini tapin.
    Numune:111,222 111+222/2 2 burda el ile yazilmasin bu 4,5,6 reqemler ucunde odensin
    */

    var sum = 0
    var count = 0
    for (item in 100..1000) {
        var itemText = item.toString()
        var isSame = true
        for (index in 1..<itemText.length) {
            if (itemText[index] != itemText[0]) {
                isSame = false
            }
        }
        if (isSame) {
            sum += item
            count++
        }

    }
    val mean = sum.toDouble() / count.toDouble()
    println(mean)

    /*
    2.100-1000 araliginda butun sade ve murekkeb ededlerin sayini tapan proqram yazin.Her ikisinin sayini
    */

    var prime = 0
    var composite = 0
    for (item in 100..1000) {
        var isPrime = true
        for (divItem in 2..1000 / 2) {
            if (item % divItem == 0) {
                isPrime = false

            }
        }
        if (isPrime) {
            prime++
        } else {
            composite++
        }

    }
    println(
        """
            Count of prime elements: $prime
            Count of composite elements: $composite
        """.trimIndent()
    )

    /*
    3.100-1000 araliginda reqemlerinin cemi 10-dan boyuk olan ededlerin ededi ortasini tapin.Numune 945=17(true) 123=6(false)
    */


    var summary = 0
    var countOfNumbers  = 0
    for(item in 100..1000) {
        var sumOfNumbers = 0
        val compare = item.toString()
        for(index in 0..<compare.length) {
            sumOfNumbers += compare[index].digitToInt()

        }
        if(sumOfNumbers > 10) {
            summary += item
            countOfNumbers++
        }

    }
    var average = summary.toDouble() / countOfNumbers.toDouble()
    println(average)


    /*
    4.100-1000 araliginda ededin tersi cut olan ededlerin cemini tapin. 123=321(false) 442=244(true)
    */
    var sumOfReversed = 0
    for(item in 100..1000) {
        val itemToText = item.toString()
        var reversedText = ""
        for(index in itemToText.length-1 downTo 0) {
            reversedText += itemToText[index]
        }
        if(reversedText.toInt() % 2 == 0) {
            sumOfReversed += reversedText.toInt()
        }
    }

    println(sumOfReversed)


    /*
    5.10 olculu massiv verilmisdir massivde duplikat olan ededlerin cemini tapin.
    Numune 10 20 10 40 50 20 70 70 70 -5  Result:10+20+70=100
    */
    val array = Array(10) {readln().toInt()}
    var sumOfDuplicates = 0
    for(index1 in 0..<array.size) {
        for(index2 in index1+1..<array.size) {
            if(array[index1] == array[index2]) {
                sumOfDuplicates += array[index1]
            }
        }
    }
    println(sumOfDuplicates)

    /*
    6.10 olculu massiv verilmisdir ikinci en boyuk elementi tapin
    */

    val massiv = Array(10) {readln().toInt()}
    var secondMax = massiv[0]
    var maxOfNum = massiv[0]
    for(num in massiv) {
        if(num > maxOfNum) {
            secondMax = maxOfNum
            maxOfNum = num
        } else if (num > secondMax && num < maxOfNum) {
            secondMax = num
        }
    }
    println(secondMax)

}