package function

fun main() {
    log("hello World")
}

//Default Parameters
@JvmOverloads  //for Java code
fun log(message: String, logLevel: Int = 1) {
    println(message + logLevel)
}