fun main() {

    /*
    4.100-1000 kimi ededlerin icinden unikal ededleri ekrana cixardin.
    Numune 123,653 reqemler tekrarlanmir
    */

    for (item in 100..1000) {
        var isUnique = true
        val itemText = item.toString()
        for (index1 in 0..<itemText.length - 1) {
            for (index2 in index1 + 1..<itemText.length) {
                if (itemText[index1] == itemText[index2]) {
                    isUnique = false
                }
            }
        }
        if (isUnique) {
            println("Unique element is :${item}")
        }

    }

    /*
    5.100-1000 kimi ededlerin icinden polindrom ededler ekrana cixardin:
    Numune 121,242,111 soldan ve sagdan eyni cur oxunur
    */

    for (item in 100..1000) {
        val itemText = item.toString()
        var reversedText = ""
        for (index in itemText.length - 1 downTo 0) {
            reversedText += itemText[index]
        }
        if (itemText == reversedText) {
            println("Polindrom: ${item}")
        }

    }

    /*
    8.1-100 kimi ededlerin icinden sade ededlerin cemini tapin
    9.1-100 kimi ededlerin icinden murekkeb ededlerin cemini tapin
    */

    for (item in 2..100) {
        var isPrime = true
        for(divItem in 2..item / 2) {
            if(item % divItem == 0) {
                isPrime = false
            }
        }
        if(isPrime) {
            println("Prime element is :${item}")
        } else {
            println("Composite elements : ${item}")
        }
    }

    /*
   11.6 olculu int tipinde massiv verilib.Bu massive ededler ekrandan daxil edilir.
   Bu massivi artan sirada duzun.
   */

    val array = Array(6) { readln().toInt() }
    for(index1 in 0 until array.size-1) {
        for(index2 in index1+1..<array.size-1) {
            if(array[index1] > array[index2]) {
               var temp = array[index2]
               array[index1] = array[index2]
               array[index2] = temp
            }
        }
    }
    println(array.contentToString())
}

