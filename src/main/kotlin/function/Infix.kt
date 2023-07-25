package function

fun main() {
    val h1 = Header("h1")
    val h2 = Header("h2")

    val h3 = h1 plus h2
    println(h3.name)

    val h4 = h1 + h2
    println(h4.name)
}

/**
 * infix makes our function like an operator.
 * making our code more readable as we do not have to use brackets
 * Not to overuse the Operator keyword
 */
infix operator fun Header.plus(other: Header): Header {
    return Header(this.name + other.name)
}

class Header(var name: String)