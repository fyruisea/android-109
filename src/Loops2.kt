fun main() {
    /*
    1.6 olculu int tipinde massiv verilib.Bu massive ededler ekrandan daxil edilir.
    Bu massivin max elementini tapin.
    */

    val array = IntArray(6)

    for(index in array.indices) {
        array[index] = readln().toInt()
    }

    var max = array[0]
    for(item in array) {
        if(item > max)
            max = item
    }

    println("Netice:$max")

    /*
    2.6 olculu int tipinde massiv verilib.
    Bu massive ededler ekrandan daxil edilir.Bu massivin min elementini tapin.
    */

    var min = array[0]
    for(item in array) {
        if(item < min)
            min = item
    }

    println("Netice:$min")

    /*
    3.6 olculu int tipinde massiv verilib.Bu massive ededler ekrandan daxil edilir.
    Bu massivin elemenlerinin ededi ortasini tapin.
    */

    var sum = 0
    for(item in array) {
        sum += item
    }
    var mean = sum / 6
    println(mean.toDouble())

    /*
    4.100-1000 kimi ededlerin icinden unikal ededleri ekrana cixardin.
    Numune 123,653 reqemler tekrarlanmir
    */
    for (item in 100 until 1000) {
        val a = item / 100
        val b = (item / 10) % 10
        val c = item % 10
        if(a != b && b != c && a != c) {
            println(item)
        }
    }

    /*
    5.100-1000 kimi ededlerin icinden polindrom ededler ekrana cixardin:
    Numune 121,242,111 soldan ve sagdan eyni cur oxunur
    */

    for (item in 100 until 1000) {
        val a = item / 100
        val b = (item / 10) % 10
        val c = item % 10
        if(a == c) {
            println(item)
        }
    }

    /*
    6.1-100 kimi ededlerin icinden hem 3 hemde 9 bolunen ededlerin cemini cixardin
    */

    var add = 0
    for(item in 1..100) {
        if(item % 3 == 0 && item % 9 == 0) {
            sum += item
        }
    }
    println(sum)

    /*
    7."Bugun  28.03.2023 tarixinde 27 qeza bas vermisdir" cumlesinde ededlerin cemini tapın(Dovr ile)
    */

    val text = "Bugun  28.03.2023 tarixinde 27 qeza bas vermisdir"
    var sumOfDigits = 0

    for(ch in text) {
        if(ch.isDigit()) {
            sumOfDigits += ch.toString().toInt()
        }
    }
    println(sumOfDigits)

    /*
    8.1-100 kimi ededlerin icinden sade ededlerin cemini tapin
    */

    var sumOfPrime = 0
    for(item in 2..100) {
        var isPrime = true
        for(i in 2..item / 2) {
            if (item % i == 0) {
                isPrime = false
                break
            }
        }
        if(isPrime) {
            sumOfPrime += item
        }
    }
    println(sumOfPrime)

    /*
    9.1-100 kimi ededlerin icinden murekkeb ededlerin cemini tapin
    */

    var sumOfComposite = 0

    for(item in 2..100){
        var isPrime = true
        for(i in 2..item / 2) {
            if(item % i == 0) {
                isPrime = false
                break
            }
        }
        if(!isPrime) {
            sumOfComposite += item
        }

    }
    println(sumOfComposite)

    /*
    10.1-100 kimi ededlerin icinden hem 3 ve ya 8 bolunen ededlerin cemini tapin.
    */
    var sumOfThem = 0
    for(item in 1..100) {
        if(item % 3 == 0 || item % 8 == 0) {
            sumOfThem += item
        }
    }
    println(sumOfThem)

    /*
    11.6 olculu int tipinde massiv verilib.Bu massive ededler ekrandan daxil edilir.
    Bu massivi artan sirada duzun.
    */

    val arr = IntArray(6)
    for(index in arr.indices) {
        arr[index] = readln().toInt()
    }
    arr.sort()

    for(item in arr) {
        print("$item ")
    }
}