package highlevelFunctions

fun main() {
    var program = Program()
    //old code with Java OO design to implement Stratergy patern
    //program.fibonacci(8)

    program.fibonacci(8, object : Process{
        override fun execute(value: Int) {
            println(value)
        }

    })
}

interface Process {
    fun execute(value: Int)
}

class Program {

    fun fibonacci(limit: Int, action: Process) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            action.execute(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            println(current)


            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}