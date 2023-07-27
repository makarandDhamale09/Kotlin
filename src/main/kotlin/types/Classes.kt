package types

/**
 * If we make Person class open then only it can be extended by any other class.
 * Same goes with the method as well. By default, Class and method are final
 * Other option is to make our class, method abstract
 * Unlike in Java by default the classes are public in Kotlin.
 * There is an 'internal' Keyword in Kotlin
 */
abstract class Person {
    var firstName: String = ""
    var lastName: String = ""

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress() : String
}

class Student : Person() {
    override fun getName(): String {
        return ""
    }

    override fun getAddress(): String {
       return ""
    }
}