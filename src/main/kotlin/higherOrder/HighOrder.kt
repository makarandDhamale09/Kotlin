package higherOrder

//This is a higher order function
fun applyOperation(numbers: List<Int>, operation: (Int) -> Int): List<Int> {
    return numbers.map { operation(it) }
}

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5)

    val squaredNumbers = applyOperation(numbers) { it * it }
    println("squared Numbers are $squaredNumbers")

    val doubledNumbers = applyOperation(numbers) { it * 2 }
    println("doubled Numbers are $doubledNumbers")
}