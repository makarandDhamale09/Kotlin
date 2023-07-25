package function


fun main() {
    val text = "With    multiple  \t whitespace"
    println(replaceMultipleWhiteSpaces(text))
    println(text.replaceMultipleWhiteSpacesEx())
}



/**
 * Extension functions which are similar to util functions in Java
 */
//This is a helper function like we use in Java
fun replaceMultipleWhiteSpaces(value: String): String {
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

//This is extension function add in String class, so we need not create a util class
fun String.replaceMultipleWhiteSpacesEx(): String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}
