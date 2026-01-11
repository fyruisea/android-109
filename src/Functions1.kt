import kotlin.coroutines.coroutineContext

fun main() {
    println(substring("Firuza", 5))
    println(substring("Firuza", 2, 6))
    println(stringDrop("Firuza",4))
    println(stringIndexOf("Firuza","uza"))
    println(padStart("Firuza",4,'a'))
    println(padEnd("Firuza",4,'a'))
    println(pow(4,2))

    val numbers = intArrayOf(5, 6, -7, 8, 10, -6)
    bubbleSort(numbers)
    println(numbers.contentToString())

    println(isPalindrome(121))
    isUnique(123)

    val foundNumbers = findNumbers(5,15,35,75,95,88,8)
    println(foundNumbers.contentToString())

    println(replace("Firuza",'F','B'))

}
/*
1.Stringin substring metodunu yazın və ən azı bir dəfə overloading edin.(Hazır metoddan istifadə olunmasın
 substring metodunun alqoritmini yazin)
*/

fun substring(text: String, start: Int): String {
    var result = ""

    if (start < 0 || start >= text.length) {
        return result
    }
    for (item in start..<text.length) {
        result += text[item]
    }
    return result
}

fun substring(text: String, start: Int, end: Int): String {
    var result = ""

    if (start < 0 || end > text.length || start >= end) {
        return result
    }

    for (item in start..<end) {
        result += text[item]
    }
    return result
}

/*
2.Stringin drop metodunu yazın.
(Hazır metoddan istifadə olunmasın substring metodunun alqoritmini yazin)
*/

fun stringDrop(text: String, n: Int):String {
    var result = ""

    if (n <= 0) {
        return text
    }

    if(n >= text.length) {
        return result
    }
    for(item in n..<text.length) {
        result += text[item]
    }
    return result
}
/*
3.Stringin indexof metodunu yazan
(Hazır metoddan istifadə olunmasın substring metodunun alqoritmini yazin)
*/

fun stringIndexOf(text: String, subtext: String): Int {
    if(subtext.length > text.length) {
        return -1
    }
    for(index in 0..text.length - subtext.length) {
        var found = true
        for(index2 in subtext.indices) {
            if(text[index + index2] != subtext[index2]) {
                return index
            }
        }
    }
    return -1
}
/*
4.Stringin padstart ve padend metodunu yazan
(Hazır metoddan istifadə olunmasın substring metodunun alqoritmini yazin)
*/
fun padStart(text: String, length: Int, padChar: Char): String {
    var result = ""
    for(i in text.length..<length) {
        result += padChar
    }
    result += text
    return result
}

fun padEnd(text: String, length: Int, padChar: Char): String {
    var result = text
    for(i in text.length..<length) {
        result += padChar
    }
    return result
}
/*
5.Math.pow funksiyasinin metodunu yazın
*/

fun pow(base: Int, exponent: Int): Long {
    if(exponent == 0) return 1

    var result = 1L
    for(i in 1..exponent) {
        result *= base
    }
    return result
}
/*
6.Massivin sortalasdirma alqoritminin metodunu yazın
*/
fun bubbleSort(arr: IntArray) {
    for(i in 0..<arr.size) {
        for(j in 0..<arr.size - i - 1) {
            if(arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}

/*
7.Verilmis ededin polindrom olur olmadigini yollayan metod yazan ve
eger polindromdursa true aks halda false qaytarsin
*/

fun isPalindrome(num: Int): Boolean {
    var num2 = num
    var reversed = 0

    while(num2 != 0) {
        val digit = num2 % 10
        reversed = reversed * 10 + digit
        num2 /= 10
    }
    return num == reversed
}

/*
8.Verilmis ededin unique eded olur olmadigini tapan metod yazan ve
geriye değer qaytarmasin neticeni metodun icinde cixartsin.
*/

fun isUnique(num: Int) {
    val num2 = num.toString()

    for(i in num2.indices) {
        for(j in i+1..<num2.length) {
            if(num2[i] == num2[j]) {
                println("Not unique")
                return
            }
        }
    }
    println("is Unique")
}

/*
9. Metod istenilen sayda parametr qebul eder ve bu ededlerin hem 3 ve 5
bolunen ededleri geri qaytaran metod yazin. Ededler bir bir qayitmamalidir
*/

fun findNumbers(vararg numbers: Int): IntArray {
    var count = 0
    for(n in numbers) {
        if(n % 3 == 0 && n % 5 == 0) {
            count++
        }
    }
    val result = IntArray(count)
    var index = 0

    for(n in numbers) {
        if(n % 3 == 0 && n % 5 == 0) {
            result[index] = n
            index++
        }
    }
    return result
}

/*
10.String replace metodunu yazın.
*/
fun replace(text: String, oldChar: Char, newChar: Char): String {
    var result = ""

    for(i in text.indices) {
        if(text[i] == oldChar) {
            result += newChar
        } else {
            result += text[i]
        }
    }
    return result
}
