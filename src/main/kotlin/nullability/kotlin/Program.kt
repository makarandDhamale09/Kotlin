package nullability.kotlin

fun main(args: Array<String>) {
    val m:Meeting? = null
    var newMeeting: Meeting;

    newMeeting = m ?: Meeting()

    closeMeeting(newMeeting)

    closeMeeting(m)
}

fun closeMeeting(m : Meeting?): Boolean{
    return if(m?.canClose == true) m.close()
    else false
}

class Meeting{
    var canClose : Boolean = false

    fun close(): Boolean{
        return true;
    }
}