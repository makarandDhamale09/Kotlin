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

class Student{
    fun enrole(courseName : String){
        val course = Courses.allCourses
            .filter { it.title == courseName }
            .firstOrNull()
        println(course?.title)
    }
}

fun main() {
    var student = Student()
    student.enrole("Kotlin Fundamentals")
}