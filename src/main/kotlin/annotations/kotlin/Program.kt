package annotations.kotlin

import annotations.java.Address
import annotations.java.Meeting

fun main(args: Array<String>) {
    val meeting = Meeting()

    meeting.addTitle("Title")
//    meeting.addTitle(null)

    val meetingTitle : String? = meeting.meetingTitle()

    println(meetingTitle)

    val i : String = meeting.titleCanBeNull()

}

class HomeAddress : Address{
    override fun getFirstAddress(): String {
        return ""
    }
}

class WorkAddress : Address{
    override fun getFirstAddress(): String? {
        return null
    }
}