package collections

fun main(args: Array<String>) {
    //immutable list of integers
    val ints = listOf(1, 2, 3, 4)

    //mutable List Of Integers
    val intMutableList = mutableListOf(1, 2, 3, 4)

    intMutableList.add(5)

    println(intMutableList)
    //prints 3 index
    println("Print 3rd index : ${intMutableList[3]}")

    for (i in intMutableList) {
        println(i)
    }

    //immutable map
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    for (i in map) {
        println(i)
    }

    val mutableMapOf = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    println("Print value of key 2 : ${mutableMapOf[2]}")

}