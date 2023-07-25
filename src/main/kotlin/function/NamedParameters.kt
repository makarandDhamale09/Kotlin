package function


fun main() {
    params(logLevel = 2, message = "Named Parameters")
}

//Named Parameters
fun params(message: String, logLevel: Int) {
    println(message + logLevel)
}
