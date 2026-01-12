fun main() {

    val students = listOf(
        Student(1, "Firuza",80,88),
        Student(2, "Fidan",40,45),
        Student(3, "Nargiz",60,90),
    )
    for(i in students.indices) {
        if(students[i].isPassed()) {
            println("${students[i].name} passed - Ortalama: ${students[i].average()}")

        }
    }
    var maxAverage = students[0].average()
    var topStudent = students[0]
    for(i in 1..<students.size) {
        val currentAverage = students[i].average()
        if(currentAverage > maxAverage) {
            maxAverage = currentAverage
            topStudent = students[i]
        }
    }
    println("${topStudent.name} average is $maxAverage")


    val oldOrder = Order(
        orderId = 101,
        productName = "Laptop",
        price = 2000.0,
        quantity = 1
    )
    val newOrder = oldOrder.copy(quantity = 3)
    println(oldOrder)
    println(oldOrder.totalPrice())
    println(newOrder)
    println(newOrder.totalPrice())

    val account= BankAccount("Firuza",8888.0)
    val t1 = BankAccount.Transaction(1000.0,"DEPOSIT")
    val t2 = BankAccount.Transaction(800.0,"WITHDRAW")
    val t3 = BankAccount.Transaction(700.0,"DEPOSIT")
    println(account.ownerName)
    println(account.balance)
    t1.printTransaction()
    t2.printTransaction()
    t3.printTransaction()

    val user = User("Firuza","nazarlifiruza0@gmail.com")
    val adress = user.Address(
        city = "Baku",
        street = "A.Ahmadov"
    )
    println(adress.fullAdress())

    val course = Course("EHE",2)

    course.addStudent(1,"Firuza")
    course.addStudent(2, "Nargiz")
    course.addStudent(3, "Fidan")

    course.printStudents()

}
/*
1️⃣ Data class – Tələbə Qiymətləndirmə Sistemi
Tapşırıq:
Student adlı data class yaradın.
Xüsusiyyətlər:
id: Int
name: String
midterm: Int
finalExam: Int
Tələblər:
average() funksiyası yazın (40% midterm, 60% final).
isPassed() funksiyası yazın (ortalama ≥ 50).
3 tələbədən ibarət List Student yaradın və:
Keçənləri ayrıca çap edin
Ən yüksək ortalaması olan tələbəni tapın
*/

data class Student(
    val id: Int,
    val name: String,
    val midterm: Int,
    val finalExam: Int,
) {
    fun average(): Double {
        return midterm * 0.4 + finalExam * 0.6
    }

    fun isPassed(): Boolean {
        return average() >=  50
    }
}

/*
2️⃣ Data class + copy() – Sifariş Yenilənməsi
Tapşırıq:
Order adlı data class yaradın.
Xüsusiyyətlər:
orderId: Int
productName: String
price: Double
quantity: Int
Tələblər:
totalPrice() funksiyası yazın
copy() istifadə edərək:
Eyni sifarişin quantity-si dəyişmiş yeni versiyasını yaradın
Köhnə və yeni sifarişi müqayisə edin (==)
*/

data class Order(
    val orderId: Int,
    val productName: String,
    val price: Double,
    val quantity: Int
) {
    fun totalPrice(): Double {
        return price * quantity
    }
}

/*
3️⃣ Nested class – Bank Hesabı Analizi
Tapşırıq:
BankAccount adlı class yaradın.
Xüsusiyyətlər:
ownerName: String
balance: Double
Nested class:
Transaction
Transaction xüsusiyyətləri:
amount: Double
type: String (DEPOSIT, WITHDRAW)
Tələblər:
Transaction nested class olsun (inner DEYİL)
Transaction yalnız öz datası ilə işləsin
Bir neçə transaction yaradıb çap edin
👉 Qeyd: Transaction outer class-ın field-lərinə çıxış etməməlidir.
*/

class BankAccount(
    val ownerName: String,
    val balance: Double
) {
    class Transaction(
        val amount: Double,
        val type: String
    ) {
        fun printTransaction() {
            println("$type, $amount")
        }
    }
}

/*
4️⃣ Inner class – User & Address Əlaqəsi
Tapşırıq:
User adlı class yaradın.
Xüsusiyyətlər:
username: String
email: String
Inner class:
Address
Address xüsusiyyətləri:
city: String
street: String
Tələblər:
Address inner class olsun
fullAddress() funksiyası yazın və username istifadə etsin
User obyektindən Address yaradın
👉 Məqsəd: inner class-ın outer class-a çıxışını göstərmək.
*/

class User(
    val username: String,
    val email: String
) {
    inner class Address(
        val city: String,
        val street: String
    ) {
        fun fullAdress(): String {
            return "$username, $city, $street"
        }
    }
}

/*
5️⃣ Data class + Inner class – Kurs Sistemi (Çətin)
Tapşırıq:
Course adlı class yaradın.
Xüsusiyyətlər:
courseName: String
maxStudents: Int
Inner data class:
Student
Student xüsusiyyətləri:
id: Int
name: String
Tələblər:
Kursa tələbə əlavə edən funksiya yazın
Maksimum tələbə sayı aşılarsa əlavə etməsin
Kursdakı bütün tələbələri çap edən funksiya yazın
Student data class və inner class olsun
*/

class Course(
    val courseName: String,
    val maxStudents: Int
) {
    val students = mutableListOf<Student>()

    inner class Student(
        val id: Int,
        val name: String
    )

    fun addStudent(id: Int, name: String) {
        if(students.size >= maxStudents) {
            println("Xeta")
            return
        }

        students.add(Student(id, name))
        println("$name, tebrikler")
    }

    fun printStudents() {
        if(students.isEmpty()) {
            println("Xeta")
            return
        }
        for(i in students.indices) {
            val student = students[i]
            println("${i + 1}. ${student.name} (ID: ${student.id})")
        }
    }
}