package controlFlow

fun main(args: Array<String>) {

    //if statements
    val n = 9
    val weather = if (n < 0)
        "bit cold"
    else if (n < 10)
        "cold"
    else
        "warm"

    println("The weather is $weather")

    //Alternative for ternary operator in kotlin
    val a = 2
    val b = 3

    val result = if(a > b) a else b

    println("Result is $result")

    //when statements alternative to switch statements
    val obj = "Hello"

    val objResult = when (obj) {
        "1" -> "one"

        "Hello" -> "Greeting"

        else -> "Unknown Object"
    }

    println("When statement result : $objResult")


    //Ranges in Kotlin using '..' and 'downTo' operator
    println("Ranges........")

    for(number in 1..5){
        print("$number ")
    }
    println()
    for(num in 1..10 step 2){
        print("$num ")
    }

    println()
    for(revnum in 10 downTo 1){
        print("$revnum ")
    }

    println()
    for(char in 'a'..'m'){
        print("$char ")
    }
}