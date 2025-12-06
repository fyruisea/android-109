fun main() {
    //3;8 bolunenlerin cemi

    var sum = 0
    for (item in 1..100) {
        if (item % 3 == 0 && item % 8 == 0) {
            sum += item
        }
    }
    println(sum)

    //10 bolunen cemi ile 3 e bolunenlerle ferqi

    var sub = 0
    var sumOfFirst = 0
    var sumOfSecond = 0
    for (item in 1..100) {
        if (item % 10 == 0) {
            sumOfFirst += item
        }
        if (item % 3 == 0) {
            sumOfSecond += item
        }
    }
    val result = sumOfFirst - sumOfSecond
    println(result)

    println("----------------------------------------------")

    println("***")

    for(item in 1..3) {
        print("*")
    }

    println()

    println("""
        *
        *
        *
    """.trimIndent())

    for(item in 1..3) {
        println("*")
    }

    for(item in 1..3) {
        for(item in 1..3){
            print("*")
        }
        println()
    }

    for(item in 1..4) {
        for(item in 1..2) {
            print("*")
        }
        println()
    }

    for(item in 1..3) {
        for(item in 1..4) {
            print("*")
        }
        println()
    }

    for(item in 1..5) {
        for(item in 1..item){
            print("*")
        }
        println()
    }

    for(item in 1..5) {
        for(item in item..5){
            print("*")
        }
        println()
    }

    for(item in 1..5) {
        for(item2 in 1..5-item) {
            print(" ")
        }
        for(item3 in 1..item*2-1) {
            print("*")
        }
        println()
    }

    for(item in 4 downTo 1) {
        for(item2 in 1..5-item) {
            print(" ")
        }
        for(item3 in 1..item*2-1) {
            print("*")
        }
        println()
    }
}