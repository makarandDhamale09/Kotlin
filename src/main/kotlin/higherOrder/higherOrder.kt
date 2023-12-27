package higherOrder

val action = { println("Hello World") }
val calc: (Int, Int) -> Int = { x, y -> x * y }

//accepting lambda as a parameter is called as a higher order function
//here this method will accept all types of methods that take 0 parameters and return unit
fun doSomething(func: () -> Unit) {
    func()
}

fun doSomethingElse(func: (Int, Int) -> Int) {
    val invoke = func(2, 4)
    println(invoke)
}

fun main(args: Array<String>) {
    doSomething(action)
    val cal = calc(2, 2)
    println(cal)

    doSomethingElse(calc)
}