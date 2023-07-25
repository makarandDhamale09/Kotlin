package function

fun main() {
    display("Hello World")
    println(max(1,2))
}

fun display(message: String): Boolean {
    println(message)
    return true
}

//Function expression
fun max(a: Int, b: Int) = if (a > b) a else b