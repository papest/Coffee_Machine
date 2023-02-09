const val MIN_LENGTH_OF_PASSWORD = 5
fun validatePassword(password: String): Boolean {

    val validationResult = password.length >= MIN_LENGTH_OF_PASSWORD

    println(
        if (validationResult) {
            "Good password"
        } else {
            "Your password should be five or longer characters, please write a new password"
        }
    )

    return validationResult

}

fun main() {

    var validationResult = false

    while (!validationResult) {
        val password = readln()
        validationResult = validatePassword(password)
    }

}