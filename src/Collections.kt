fun main() {
    myList()
    isUnique()
    studentGrades()
    mySetList()
    sumOfDublicates()
}
/*
1.Set kolleksiyasinin isleme prinsipi
->Deyerler HashCode toplusu seklinde saxlanir, Daha sonra HashBucket adlanan
sebetlere yerlesdirilir. Equals metodu vasitesiyle yoxlanilaraq, eyni elementler
elave edilmir, eks halda elave edilir. Bucketde saxlanilir.

Equals -> == Deyer beraberliyini yoxlayir (Structual)
=== -> Referansal beraberliyi yoxlayir

Kotlinde primitiv tip yoxudr her sey obyektdir, lakin Numbers. Boolean. Char
ve s. ozunu primitiv kimi apara bilir.

var a = 5
var b = 5

== n === -> true
*/


/*
2.8 olculu list verilir.Hemin listde duplicate olan elementleri silmek
(hazir toset etmeyin :D)
Numune:1,2,3,5,7,3,2 Netice 1,5,7
*/

fun myList() {
    val list = listOf(1, 2, 3, 4, 3, 2, 1, 6, 7, 6, 8, 9)
    val result = mutableListOf<Int>()

    for (item in list) {
        var count = 0

        for (check in list) {
            if (item == check) {
                count++
            }
        }
        if (count == 1) {
            result.add(item)
        }
    }
    println(result)
}

/*
3.8 olculu list verilir.Hemin liste unikal ededleri listden silmek.
Numune:111,2221,332,567,778,321,232 Netice 567,321
*/

fun isUnique() {
    val list = listOf(111, 2221, 332, 567, 778, 321, 232)
    val result = mutableListOf<Int>()

    for (number in list) {
        val digits = number.toString()
        var isUnique = true

        for (i in digits.indices) {
            for (j in i + 1..<digits.length) {
                if (digits[i] == digits[j]) {
                    isUnique = false
                    break
                }
            }
            if (!isUnique) break
        }
        if (isUnique) {
            result.add(number)
        }
    }
    println(result)

}

/*
4. val telebeQiymetleri = mapOf(
        "Aysel" to mapOf("Riyaziyyat" to 90, "Fizika" to 85, "Kimya" to 88),
        "Elvin" to mapOf("Riyaziyyat" to 75, "Fizika" to 80, "Kimya" to 70),
        "Leyla" to mapOf("Riyaziyyat" to 95, "Fizika" to 92, "Kimya" to 89)
    )

    // Tapşırıqlar:
    // 1. Hər tələbənin orta balını hesablayın
    // 2. Ən yüksək orta bala malik tələbəni tapın
    // 3. "Riyaziyyat" fənni üzrə ən yüksək qiyməti olan tələbəni tapın
*/

fun studentGrades() {
    val telebeQiymetleri = mapOf(
        "Aysel" to mapOf("Riyaziyyat" to 90, "Fizika" to 85, "Kimya" to 88),
        "Elvin" to mapOf("Riyaziyyat" to 75, "Fizika" to 80, "Kimya" to 70),
        "Leyla" to mapOf("Riyaziyyat" to 95, "Fizika" to 92, "Kimya" to 89)
    )
    val averages = mutableMapOf<String, Double>()

    for ((telebe, qiymet) in telebeQiymetleri) {
        val mean = qiymet.values.average()
        averages[telebe] = mean
        println("$telebe orta bal: $mean")
    }
    var best = ""
    var max = 0.0

    for ((telebe, mean) in averages) {
        if (mean > max) {
            max = mean
            best = telebe
        }
    }
    println("Xalxin usagi: $best ($max)")

    var mathGenius = ""
    var maxMath = 0

    for ((telebe, qiymet) in telebeQiymetleri) {
        val math = qiymet["Riyaziyyat"] ?: 0

        if (math > maxMath) {
            maxMath = math
            mathGenius = telebe
        }
    }

    println("Math Genius: $mathGenius ($maxMath)")
}

/*
5.8 olculu setListi verilib ve bu
listde 2 ve 8 bölünen ededlerin cemini tapan
*/

fun mySetList() {
    val setList = listOf(3, 4, 5, 6, 7, 8, 18)
    var sum = 0

    for (item in setList) {
        if (item % 2 == 0 && item % 8 == 0) {
            sum += item
        }
    }
    println(sum)
}

/*
6.8 olculu list verilir ve bu listde tekrar olan ededlerin cemini tapan
10,20,30,10,20,30,40,10,20  Netice:10+20+30=60
*/

fun sumOfDublicates() {
    val list = listOf(1, 8, 8, 18, 18, 9, 7, 6)
    var result = mutableSetOf<Int>()

    for(i in list.indices) {
        var count = 0
        for(j in list.indices) {
            if(list[i] == list[j]) count++
        }
        if(count > 1) {
            result.add(list[i])
        }
    }
    val sum = result.sum()
    println(sum)
}
