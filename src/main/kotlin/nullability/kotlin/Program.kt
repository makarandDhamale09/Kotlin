package nullability.kotlin

fun main(args: Array<String>) {
    val m: Meeting? = null
    var newMeeting: Meeting;

    newMeeting = m ?: Meeting()

    val closeMeeting = closeMeeting(newMeeting)

    val closeMeeting1 = closeMeeting(m)

    println("Close Meeting $closeMeeting and $closeMeeting1")
}

fun closeMeeting(m: Meeting?): Boolean {
    return if (m?.canClose == true) m.close()
    else false
}

class Meeting {
    var canClose: Boolean = true
    lateinit var address: Address
    fun close(): Boolean {
        address = Address()
        println("Adderss City ${address.city}")
        return true;
    }
}

class Address {
    val city: String = "Pune"
}