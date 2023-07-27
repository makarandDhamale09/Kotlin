package types

/**
 * there are 2 constructors in Kotlin default constructor and secondary constructor
 */
open class Persons(var firstName : String, var lastName: String) {
}


class Students(firstName: String, lastName: String, val id: Int) : Persons(firstName, lastName) {
    var tutor = ""
    constructor(firstName: String, lastName: String,id: Int, tutor : String): this(firstName, lastName, id){
        this.tutor = tutor
    }
}

class Teacher(){
    constructor(firstName: String, lastName: String) : this()
}

fun main() {
    var student = Students("Makarand", "Dhamale", 1)
    student.firstName = "Mandar"
    println(student.firstName)

    student = Students("Makarand", "Dhamale", 1, "tutor")
    println(student.toString())

    var teacher = Teacher()
    teacher = Teacher("Makarand", "Dhamale")
}