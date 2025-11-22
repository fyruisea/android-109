fun main() {
    /*
     1.12323564 ədədində hər bir ədədidin kvadratını tapın və sonra bu tapılmış ədədlərin
     ədədi ortasını tapın
    */

    val num = 12323564

    val num1 = (12323564 / 10000000)
    val num2 = (12323564 / 1000000) % 10
    val num3 = (12323564 / 100000) % 10
    val num4 = (12323564 / 10000) % 10
    val num5 = (12323564 / 1000) % 10
    val num6 = (12323564 / 100) % 10
    val num7 = (12323564 / 10) % 10
    val num8 = 12323564 % 10

    val meanOfSquares = ((num1 * num1) + (num2 * num2) + (num3 * num3) + (num4 * num4) + (num5 * num5) +
            (num6 * num6) + (num7 * num7) + (num8 * num8)) / 8
    println(meanOfSquares)

    /*
    2.12323564 ədədin hər bir ədədi tapın və sonra onların hasilin tapan proqram yazın
    */

    val multiplication = (num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8)
    println(multiplication)

    /*
    3.12323564 ədədin hər bir ədədi tapın və onlarin hasili ilə ədədi ortasının cəmini tapın
    */

    val sum = meanOfSquares + multiplication
    println(sum)

    /*
    4.12323564 ədədin ilk 4 ədədin hasili tapın və sonra son iki ədədin cəmini tapın.
    Tapılmış hasili cəmə böldükdə qalığı tapın.
    */

    val mulOfFour = (num1 * num2 * num3 * num4)
    val sumOfTwo = (num7 + num8)

    val residue = mulOfFour % sumOfTwo
    println(residue)

    /*
    5.12323564 ədədin ilk 4 ədədin hasili  ilə son 4 ədədin cəmi arasındakı fərqin kvadratını tapın
    */
    val sumOfFour = (num5 + num6 + num7 + num8)

    val sub = mulOfFour - sumOfFour
    println(sub * sub)

    /*
    val num1=290
    val num2=num1.toByte()
    println(num2)
    Cavab:34
    34 cixma sebebini iki say sistemine cevirerek izahini yazmaq.Ne ucun 34 alindigini
    */

    /*
    CAVAB:
    6.290-u ikilik say sistemine 2-ye bole bole qaliqlari tersine goturerek yaziriq
    010001001 - 100100010
    byte 8 bit yaddas saxlaya bilir bu ise 9 bitlikdir
    00100010 bu hisseni cevirir o da - 34 edir
    1 * 2 + 1 * 32 = 34
    */

    /*
    7.6.val num1=180
    val num2=num1.toByte()
    println(num2)
    Cavab:-76
    -76 cixma sebebini iki say sistemine cevirerek izahini yazmaq.Ne ucun -76 alindigini
    */

    /*
    CAVAB:
    180 - 00101101 == 10110100
    burda msb 1 ile baslayir bu da hemin ededi menfi edir:
    1*4 + 1*16 + 1*32 + (-1)*128 = -76
    */

}