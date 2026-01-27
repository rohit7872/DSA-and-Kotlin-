fun main() {
    primeFactors(1440)
}

fun primeFactors(number: Int) {
    var num = number
    var div = 2
    while (num > 1) {
        if (num % div == 0) {
            println(div)       // Print factor
            num /= div         // Reduce number
        } else {
            div++              // Try next
        }
    }
}
