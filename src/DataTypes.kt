fun main() {
    /*
  1.val text="Bugun ayin 15-dir" cumlesindeki ededlerin cemini tapin(index ile).
  */

    val text = "Bugun ayin 15-dir"
    val sum = text[11].digitToInt() + text[12].digitToInt()
    println(sum)

    /*
    2.Ekrandan(read) daxil edilmis iki ededin cemini tapin ve string templateden istifade ederek
    bu yazini ekrana cixardin "Netice:5" (5-burda cemi bildirir)
    */

    println("1-ci ededi daxil edin:")
    val num1 = readln()
    println("2-ci ededi")
    val num2 = readln()
    val summary = num1.toInt() + num2.toInt()
    println("Neticeniz:$summary")

    /*
    3.val num1="10" val num2="20" bu iki ededin cemini tapin ve string template ile ekrana cixardin
    */

    val number1 = 10
    val number2 = 20
    val add = number1 + number2
    println("Ededlerin cemi:$add")

    /*
    4.val char='A' ve val char ='B' bu iki herfin unicode cedvelindeki kodlarin cemini ekrana cixardin
    */
    val char = 'A'
    val char2 = 'B'
    val uniSum = char.code + char2.code
    println(uniSum)

    /*
    5.Ekrandan daxil edilmis iki ededin cemini,hasilini ve ededi ortasini tapin
    ve asagidaki sekilde bir stringde(deyisen) ekrana cixardin.Bir deyerin icinde olsun yeni
    bu uc metn bir stringin icinde her biri alt setrde olacaq sekilde olmalidir.

     Iki ededin cemi:'50'
     Iki ededin hasili:'100'
     Iki ededin ededi ortası:'75'
    */

    println("Ilk ededi daxil edin:")
    val numb1 = readln()
    println("Ikinci ededi daxil edin:")
    val numb2 = readln()
    val addition = numb1.toInt() + numb2.toInt()
    val multiplication = numb1.toInt() * numb2.toInt()
    val mean = addition / 2

    val resultOfAll = """
        Iki ededin cemi:'$addition'
        iki ededin hasili:'$multiplication'
        Iki ededin ededi ortasi:'$mean'
    """.trimIndent()

    println(resultOfAll)

}