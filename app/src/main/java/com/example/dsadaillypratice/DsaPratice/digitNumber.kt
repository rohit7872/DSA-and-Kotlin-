fun main() {
    println( reverseNumber(123))
}

fun reverseNumber(num: Int) {
    var number = num
    var reversed = 0

    while (number != 0) {
        val digit = number % 10  // Get last digit
        reversed = reversed * 10 + digit  // Build reversed number
        number /= 10  // Remove last digit
    }

    println(reversed)
}
