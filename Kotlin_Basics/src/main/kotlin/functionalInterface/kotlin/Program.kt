package functionalInterface.kotlin

import functionalInterface.java.User

fun main(args: Array<String>) {
    var user = User("Kevin")

    user.create{ println("User $it has been created") }
}