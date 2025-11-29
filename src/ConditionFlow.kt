fun main() {
    /*
    1.Ekrandan daxil edilmis iki ededin en boyuyunu tapan proqram yazin.
    */
    println("1-ci ededi daxil edin:")
    val num1 = readln().toInt()
    println("2-ci ededi daxil edin:")
    val num2 = readln().toInt()

    if (num1 > num2) {
        println(num1)
    } else {
        println(num2)
    }

    /*
    2.Ekrandan daxil edilmis ededin cut olub olmadigini yoxlayan proqram yazin
    */

    println("Eded daxil edin:")
    val num = readln().toInt()

    if (num % 2 == 0 && num > 0) {
        println("Eded cut ededdir")
    } else {
        println("Eded tek ededdir")
    }

    /*
    3.Ekrandan daxil edilmis eded hem 3 hem de 5 bolunerse ekrana "Bu eded 3 ve 5
    bolunur cixartsin" eks halda bolunmur mesajini cixartsin
    */

    println("Ededi daxil edin:")
    val number = readln().toInt()

    if (number % 3 == 0 && number % 5 == 0) {
        println("Bu eded 3 ve 5- e bolunur")
    } else {
        println("Bolunmur")
    }

    /*
    4.Ekrandan daxil edilmis eded 10 ve ya 12 den birine bolunerse "Bu eded 10 ve ya 12 bolunur cixartsin"
    eks halda bolunmur mesajini cixartsin
    */

    println("Ededi daxil edin:")
    val numb = readln().toInt()

    if (numb % 10 == 0 || numb % 12 == 0) {
        println("Bu eded 10 ve ya 12 bolunur")
    } else {
        println("Bolunmur")
    }

    /*
    5.Ekrandan daxil edilmis uc ededin en boyuyunu tapan proqram yazin.
    */

    println("1-ci ededi daxil edin:")
    val n1 = readln().toInt()
    println("2-ci ededi daxil edin:")
    val n2 = readln().toInt()
    println("3-cu ededi daxil edin:")
    val n3 = readln().toInt()

    if (n1 > n3 && n1 > n2) {
        println(n1)
    } else if (n2 > n1 && n2 > n3) {
        println(n2)
    } else {
        println(n3)
    }

    /*
    6.Ekrandan ucbucagin 3 terefi daxil edilir ve bu ucbucagin
    beraberterefli,beraberyanli ve ya terefleri muxtelif oldugunu tapan proqram yazin
    */

    println("1-ci terefi daxil edin")
    val firstSide = readln().toInt()
    println("2-ci terefi daxil edin")
    val secondSide = readln().toInt()
    println("3-ci terefi daxil edin")
    val thirdSide = readln().toInt()

    if (firstSide + secondSide > thirdSide &&
        firstSide + thirdSide > secondSide &&
        secondSide + thirdSide > firstSide
    ) {

        if (firstSide == secondSide && firstSide == thirdSide) {
            println("Ucbucaq berabertereflidir")
        } else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
            println("Beraberyanlidir")
        } else {
            println("Muxtelif tereflidir")
        }
    } else {
        println("Bele ucbucaq olmur")
    }

    /*
    7.Ekrandan 2 eded daxil edilir ve elave olaraq bu iki eded ucun operator daxil edilir
    (Meselen :+ ve ya  -)
    Daxil edilmis operatora uygun riyazi emeliyyati yerine yetirib ekrana cixardin
    */

    println("1-ci ededi daxil edin")
    val firstNum = readln().toInt()
    println("2-ci ededi daxil edin")
    val secondNum = readln().toInt()

    println(
        """
        1.Toplama
        2.Cixma
        3.Vurma
        4.Bolme
    """.trimIndent()
    )
    val operator = readln().toInt()

    if (operator == 1) {
        println(firstNum + secondNum)
    } else if (operator == 2) {
        println(firstNum - secondNum)
    } else if (operator == 3) {
        println(firstNum * secondNum)
    } else if (operator == 4) {
        println(firstNum / secondNum)
    } else {
        println("Secimde sehvlik var")
    }

    /*
    8.Ekrandan telebenin adi daxil edilir ve onun aldigi qiymet daxil edilir.
    Asagidaki sertlere uygun derecesini mueyyenlesdiren proqram yazin
    90-100 araliginda "Hilalin derecesi "S"-dir"
    80-90 araliginda "A"
    70-80  araliginda "B"
    60-70  araliginda "C"
    50-60  araliginda "D"
    40-50  araliginda "E"
    0-40  araliginda "Hilal ugursuz oldu"
    Eks halda "Daxil edilmis qiymet uygunsuzdur"
    */

    println("Telebenin adi:")
    val name = readln()
    println("Qiymetini daxil edin")
    val grade = readln().toInt()

    if (grade >= 0 && grade <= 100) {
        if (grade >= 90) {
            println("A")
        } else if (grade >= 80) {
            println("B")
        } else if (grade >= 70) {
            println("C")
        } else if (grade >= 60) {
            println("D")
        } else if (grade >= 50) {
            println("E")
        } else {
            println("Kesildiniz!")
        }
    } else {
        println("Duzgun deyil")
    }

    /*
    9.Ekrandan iki eded daxil edilir.Biri nececi ay olmagi ve il daxil edilir.
    Hemin ay ve ile uygun olaraq ayda nece gun oldugunu tapan proqram yazin
    */

    println("Ayi daxil edin")
    val month = readln().toInt()
    println("Ili daxil edin:")
    val year = readln().toInt()

    if (month < 1 || month > 12) {
        println("Bele ay yoxdur")
    }
    if (year > 2026) {
        println("Hele o ile catmamisiq")
    }

    if (month == 1 || month == 3 || month == 5 || month == 7 ||
        month == 8 || month == 10 || month == 12) {
        println("31 days")
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
        println("30 days")
    } else if (month == 2) {
        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            println("29 days")
        } else {
            println("28 days")
        }
    }

    /*
    10.Ekrandan daxil edilmis edede uygun olaraq heftenin
    necenci gunun oldugunu tapan proqram yazin.Example 1- "Monday"
    */

    println("Gunun nomresini daxil edin:")
    val date = readln().toInt()

    if (date == 1) {
        println("Monday")
    } else if (date == 2) {
        println("Tuesday")
    } else if (date == 3) {
        println("Wednesday")
    } else if (date == 4) {
        println("Thursday")
    } else if (date == 5) {
        println("Friday")
    } else if (date == 6) {
        println("Saturday")
    } else if (date == 7) {
        println("Sunday")
    } else {
        println("Bele heftenin gunu heleki yoxdur")
    }


}