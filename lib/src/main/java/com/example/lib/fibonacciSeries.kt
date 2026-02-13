fun main() {

    var desiredNumber: Int = 10
    var firstNumber = 0
    var secondNumber = 1

    for (i in 0..desiredNumber) {
        println(firstNumber)
        val sum = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = sum

    }
}