open class Person(open var name: String = "AbdulHameed Onibyo", open var age: Int = "50") {
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