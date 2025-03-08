package generics

fun main(args: Array<String>) {
    val meetings = listOf(BoardMeeting(), FinanceMeeting(), BoardMeeting())

    val board = meetings.typeOf<BoardMeeting>()

    println(board.count())

    buildMeeting(BoardMeeting::class.java) { println(it) }
    buildMeeting<BoardMeeting> { println(it) }
}

// by making the function inline and reified the Type can be checked at run time which
// was not possible earlier
inline fun <reified T> List<*>.typeOf(): List<T> {
    val returnList = mutableListOf<T>()

    for (item in this) {
        if (item is T) {
            returnList.add(item)
        }
    }
    return returnList
}

// By passing the class definition
fun <T : Meeting> buildMeeting(
    meetigClass: Class<T>,
    action: (T) -> Unit,
): T {
    val meeting: T = meetigClass.getDeclaredConstructor().newInstance()
    action(meeting)
    return meeting
}

// by reifying the function and extracting the type of class from the generic
inline fun <reified T : Meeting> buildMeeting(action: (T) -> Unit): T {
    val meeting = T::class.java.getDeclaredConstructor().newInstance()
    action(meeting)
    return meeting
}

open class Meeting

class BoardMeeting : Meeting()

class FinanceMeeting : Meeting()
