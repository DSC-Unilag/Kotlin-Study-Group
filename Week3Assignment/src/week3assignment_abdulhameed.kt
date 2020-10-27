open class Person(open var name: String, open var age: Int) {
    fun personDetails() {
        println("My name is $name and I'm $age years old")
    }
}

class Student : Person {
    var school
        get() {
            return field
        }
        set(value) {
            field = value
        }

    fun studentDetails() {
        println("I am a student of $school")
    }
}

fun main() {
    var student = Student("AbdulHameed Onibyo", 50)
    student.school = "University of Lagos"

    student.personDetails()
    student.studentDetails()
}