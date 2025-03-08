package types

/**
 * Sealed classed are classes is like Java Sealed class.
 * It provides more control on the inheritance of that class. It acts like ENUM on steroids
 * The when Keyword is special keyword where we can find the instance of which inherited class
 */
sealed class PersonEvent {
    class Awake : PersonEvent()
    class Asleep : PersonEvent()
    class Eating(val food: String) : PersonEvent()
}

fun handlePersonEvent(event: PersonEvent) {
    //Using when and is we need not cast the event to the event type
    when (event) {
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Eating -> println(event.food)
    }
}

fun main() {
    val event1 = PersonEvent.Awake()
    handlePersonEvent(event1)
    val event = PersonEvent.Eating("Burger")
    handlePersonEvent(event)
}