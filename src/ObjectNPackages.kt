import com.school.student.StudentUtils
import com.school.teacher.TeacherUtils

fun main() {
    AppConfig.printInfo()

    Counter.printCount()
    Counter.increment()
    Counter.increment()
    Counter.printCount()
    Counter.reset()
    Counter.printCount()

    StudentUtils.printStudent()
    val teacher = TeacherUtils()
    teacher.printTeacher()
}

/*
Exercises
1.Singleton Design pattern arasdirmaq advantages disadvantages

Singleton Dizayn Pattern-i bir sinfin proqram daxilində yalnız bir instance
olmasını təmin edən və bu nüsxəyə qlobal giriş nöqtəsi təqdim edən bir modeldir.

Üstünlükləri :
1 - Sinfin birden çox nüsxəsinin yaradılmasının qarşısını alır;
2 - Yalnız bir idarə nöqtəsi olur;
3 - Sinif hər yerdən əlçatan olur;
4 - Resurslara qənaət edir.

Çatışmazlıqları:
1 - Gizli asılılıq yaratdığı üçün Anti-Pattern kimi görülməsi;
2 - Vahid Məsuliyyət Prinsipinin (SRP) pozulması
(SOLID prinsiplərinə görə, bir sinif yalnız bir iş görməlidir.
Amma Singleton həm öz nüsxəsini yaratmaqla,
həm də öz əsas funksiyasını yerinə yetirməklə iki fərqli iş görmüş olur.);
3 - Unit testlər üçün çətinlik yaratması;
4 - Gələcəkdə 2-ci bir nüsxə ehtiyacı zamanı və ya başqa bir class ilə
əvəzetmə programın yenidən yazılması deməkdir;
5 - Garbage Collector tərəfindən silinə bilməməsi
*/

/*
2.Object Declaration (Singleton məntiqi)
Şərt:
AppConfig adlı bir object declaration yarat.
Tələblər:
appName: String
version: String
printInfo() funksiyası → ekrana belə çıxarsın:
App: MyApp - Version: 1.0
📌 Məqsəd:
Object declaration-un singleton olduğunu anlamaq.
*/

object AppConfig {
    var appName: String = "MyApp"
    var version: String = "1.0"

    fun printInfo() {
        println("$appName, $version")
    }
}

/*
3.Object Declaration + State
Şərt:
Counter adlı object declaration yarat.
Tələblər:
count: Int (ilk dəyəri 0)
increment() → count +1
reset() → count = 0
printCount() → cari dəyəri çap et
📌 Məqsəd:
Object-in shared state saxladığını başa düşmək.
*/

object Counter {
    var count: Int = 0

    fun increment() {
        count += 1
    }

    fun reset() {
        count = 0
    }

    fun printCount() {
        println(count)
    }
}

/*
4.Aşağıdakı package strukturu qur:
com.school.student
com.school.teacher
Tələblər:
student paketində StudentUtils adlı object olsun
printStudent() → “Student info”
teacher paketində TeacherUtils adlı class olsun
printTeacher() → “Teacher info”
main funksiyasında hər ikisini import edib istifadə et
📌 Məqsəd:
Package + import məntiqini başa düşmək.
*/



