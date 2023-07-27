package types

/**
 * Data class implements HashCode and equals method and out of the box
 * it is similar to record in Java. But in record all the values are final but in data
 * class we can specify them as var or val
 * It also provide a copy function where we can change the parameters
 */
data class Meeting(val id: Int, val location: String)

fun main() {
    var meeting1 = Meeting(1, "London")
    var meeting2 = Meeting(1, "London")

    println(meeting1 == meeting2)

    meeting2 = meeting2.copy(location = "New York")
    println(meeting2)
}