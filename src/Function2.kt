fun main() {
    println(startWith("Firuza", "F"))
    println(takeLast("Firuza", 5))
    println(any("Firuza"))
    println(contains("Firuza", "ruza"))
    println(count("Firuza18"))
}

/*
1. Stringin StartWith funksiyasinin anoloqunu yazin
*/

fun startWith(text: String, prefix: String): Boolean {
    if (prefix.length > text.length) {
        return false
    }
    for (i in prefix.indices) {
        if (text[i] != prefix[i]) {
            return false
        }
    }
    return true
}

/*
2.TakeLAst funskiyasinin anoloqunu yazin
*/

fun takeLast(text: String, n: Int): String {
    var result = ""

    if (n <= 0) {
        return result
    }
    if (n >= text.length) {
        return text
    }
    for (item in text.length - n..<text.length) {
        result += text[item]
    }
    return result
}

/*
3.Any funksiyasinin anoloqunu yazin
*/

fun any(text: String): Boolean {
    for (i in text.indices) {
        if (text[i] in '0'..'9') {
            return true
        }
    }
    return false
}

/*
4.contains funksiyasinin anoloqunu yazib
*/

fun contains(text: String, search: String): Boolean {
    if (search.length > text.length) {
        return false
    }
    for (index in 0..text.length - search.length) {
        var isContains = true
        for (index2 in search.indices) {
            if (text[index + index2] != search[index2]) {
                isContains = false
                break
            }
        }
        if (isContains) return true
    }
    return false
}

/*
5.Count funksiyasinin anoluqnu yazin
*/

fun count(text:String): Int {
    var count = 0
    for (ch in text) {
        count += 1
    }
    return count
}