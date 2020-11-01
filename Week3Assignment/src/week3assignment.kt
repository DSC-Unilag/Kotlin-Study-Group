open class Person(open var  name:String = "james emmanuel", open var age: Int = 22) {
    var nickName:String? = "nothing"
         set(value) {
             field = value
             println("call me $field")
         }


    fun printInfo():String{
        return("My name is $name, but you can also call me $nickName and I'm $age years old")
    }
}

class Student(override var name: String, override var age:Int):Person(name, age){
    var school:String? = null
        set(value) {
            field = value
        }

    
    fun printStudentInfo(){
        println("${printInfo()}. I am a student of $school")
    }
}

fun main() {
    var student = Student("Abdulfatah Ridwan", 23)
    student.nickName = "beastCoder, "
    student.school = "University of lagos"
    student.printStudentInfo()
}
