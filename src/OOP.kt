fun main() {

    val person = Person()

    person.name = "Firuza"
    person.surname = "Nazarli"
    person.age = 19
    println(person.fullinfo())

    val book1 = Book("Kotlin Basics","John", 120)
    val book2 = Book("Slow Down","Firuza",888)
    book1.printInfo()
    book2.printInfo()

    val result1 = ExamResult("Firuza",88)
    val result2 = ExamResult("Haci",49)

    val employee1 = Employee("Firuza",8888)
    val employee2 = Employee("Fidan",100)

    employee1.printEmployee()
    employee2.printEmployee()

    val phone1 = MobilePhone("Samsung",3000)
    val phone2 = MobilePhone("Redmi",500)

    val myText = MyString("Ders oxumaq lazimdir")
    println(myText.length)
    println(myText.substring(8))
    println(myText.substring(0,8))
    println(myText.lastIndexOf('f'))
    println(myText.lastIndexOf("Ders"))

    val myList = MyList("Mascara","Lipstick","Blush")
    println(myList.size)
    myList.printList()

    myList.add("Foundation")
    println(myList.size)
    myList.printList()

    myList.remove("Lipstick")
    println(myList.size)
    myList.printList()

    myList.sort()
    myList.printList()
}

/*
Tapşırıq 1: Class və Object (constructor-suz)
Şərt:
Person adlı class yaradın.
Xüsusiyyətlər:
name: String
surname: String
age: Int
👉 Constructor yazmaq olmaz.
Funksiya:
fullInfo() →
"Name: Ali, Surname: Veli, Age: 14"
Tapşırıq:
Person object-i yaradın
Dəyərləri sonradan mənimsədin
fullInfo() funksiyasını çağırın
*/

class Person{
    var name:String = ""
    var surname:String = ""
    var age:Int = 0

    fun fullinfo():String  {
        return "$name $surname $age"
    }
}

/*
Tapşırıq 2: Primary Constructor
Şərt:
Book adlı class yaradın.
Primary constructor:
title
author
pageCount
Funksiya:
printInfo() →
"Book: Kotlin Basics, Author: John, Pages: 120"
Tapşırıq:
Book class-ından 2 fərqli object yaradın
Məlumatları çap edin
*/

class Book(var title:String,
           var author:String,
           var pageCount: Int){

    fun printInfo() {
        println("Book: $title, Author: $author, Pages: $pageCount")
    }

}

/*
Tapşırıq 3: init block
Şərt:
ExamResult adlı class yaradın.
Primary constructor:
studentName
score
init block:
Əgər score boyuk beraber 50 → "Passed"
Əks halda → "Failed"
Tapşırıq:
2 fərqli nəticə ilə object yaradın
init block-un avtomatik işlədiyini görün
*/

class ExamResult(
    var studentName:String,
    var score:Int
) {
    init {
        if(score >= 50) {
            println("Passed")
        } else {
            println("Kesr pulu yigmaq lazimdir")
        }
    }
}

/*
Tapşırıq 4: Secondary Constructor
Şərt:
Employee adlı class yaradın.
Primary constructor:
name
salary
Secondary constructor:
Yalnız name alsın
salary avtomatik 0 olsun
Funksiya:
printEmployee() →
"Name: Ali, Salary: 0"
*/

class Employee(
    var name: String,
    var salary:Int
) {
    constructor(name:String):this(name,0)

    fun printEmployee() {
        println("Name: $name, Salary: $salary")
    }
}

/*
Tapşırıq 5: Constructor + init birlikdə
Şərt:
MobilePhone adlı class yaradın.
Primary constructor:
brand
price
init block:
Əgər price boyukdurse 1000 → "Expensive phone"
Əks halda → "Affordable phone"
Tapşırıq:
2 telefon object-i yaradın
init block nəticələrini yoxlayın
*/

class MobilePhone(
    var brand:String,
    var price:Int
) {
    init {
        if(price > 1000) {
            println("Bahadir")
        } else {
            println("Salamati Redmidir")
        }
    }
}

/*
1.String kimi bir class yaratmaq ve constructorda metni qebul eder.Hemcinin bunu length kimi
propertisi olur hemin texte uygun onun uzunluğu saxliyir.Substringin iki overload olunmuş metodu ve
lastIndexofun iki overload olunmuş metodu olsun.Her birini main classinda cagirib istifade edin.
*/

class MyString(val text:String) {

      val length:Int = text.length

    fun substring(startIndex:Int):String{
        return text.substring(startIndex)
    }

    fun substring(startIndex:Int,endIndex:Int):String{
        return text.substring(startIndex,endIndex)
    }

    fun lastIndexOf(ch:Char):Int {
        return text.lastIndexOf(ch)
    }

    fun lastIndexOf(str: String):Int {
        return text.lastIndexOf(str)
    }
}

/*
2.List classiniz olsun ve bu vararak ile string tipinde kıymetler qebul etsin.Bu classin icinde bir
list sağlayın ve constructor metod cagirilan zaman bunu o liste ilave edin ve burada size propertisi olsun.Bu listin add
funksiyasi ve remove funksiyasi olsun.
liste elave etnikde ve sildikde size propertisi artmalı ve ya azalmalidi ve elave olaraq bunun sort funksiyasi olsun.
*/

class MyList(vararg items: String) {
      val list = mutableListOf<String>()

    var size = 0

    init {
        for(item in items) {
            list.add(item)
            size++
        }
    }

    fun add(item:String) {
        list.add(item)
        size++
    }

    fun remove(item:String) {
        if(list.remove(item)) {
            size--
        }
    }

    fun sort() {
        list.sort()
    }

    fun printList() {
        println(list)
    }
}



