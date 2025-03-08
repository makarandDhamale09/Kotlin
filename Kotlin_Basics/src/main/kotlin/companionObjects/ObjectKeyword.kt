package companionObjects

class Course(val id: Int,val title : String )

/**
 * Object keyword creates singleton class
 */
object Courses{
    var allCourses = arrayListOf<Course>()

    init {
        initialize()
    }

    private fun initialize(){
        allCourses.add(Course(1,"Kotlin Fundamentals"))
    }
}

open class Student{
    fun enrole(courseName : String){
        val course = Courses.allCourses
            .filter { it.title == courseName }
            .firstOrNull()
        println(course?.title)
    }

    companion object: XmlSerializer<Student>{
        fun createUndergraduate(name: String): Undergraduate{
            return Undergraduate(name)
        }

        fun cratePostgraduate(name: String): Postgraduate{
            return Postgraduate(name)
        }

        override fun toXml(item: Student) {
            TODO("Not yet implemented")
            println("This method will serialize student object")
        }
    }
}

class Undergraduate(firstName: String): Student()

class Postgraduate(firstName: String): Student()

interface XmlSerializer<T>{
    fun toXml(item: T)
}

fun main() {
    var student = Student()
    student.enrole("Kotlin Fundamentals")
}