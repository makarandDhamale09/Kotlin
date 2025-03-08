package generics

fun main(args: Array<String>) {
    val names = listOf("Kevin", "Alex")

    val itemAt = names.itemAt(1)
    println("Item At $itemAt")

    val ints = listOf(1, 2, 3, 4, 5)
    println("Item at index 4 is ${ints.itemAt(4)}")

    val n: Node<Int> = Node(2)
    println(n.value())
}

// generic functions
fun <T> List<T>.itemAt(ndx: Int): T  {
    return this[ndx]
}

// Generic class with constrain
class Node<T : Number>(private val value: T) {
    fun value(): T  {
        return value
    }
}
