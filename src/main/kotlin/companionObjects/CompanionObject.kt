package companionObjects

/*
Companion objects are like static function in Java as there is no Static in Kotlin.

 */

fun main() {
  Person.method(arrayOf("Hello"))

  val postgraduate = Student.cratePostgraduate("John")
  val undergraduate = Student.createUndergraduate("Nick")

  println(postgraduate)
  println(undergraduate)
}

class Person {
  companion object {
    fun method(args: Array<String>) {
      println("Companion Object " + args.contentToString())
    }
  }
}
