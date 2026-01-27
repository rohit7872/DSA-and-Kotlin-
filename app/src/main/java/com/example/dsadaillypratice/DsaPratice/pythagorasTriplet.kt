fun main() {
   println( pythagorasTriplet(5, 12, 13))
}

fun pythagorasTriplet(a: Int, b: Int, c: Int): Boolean {
    var bigNumer = maxOf(a , b, c)
    println(bigNumer)
    if (a==bigNumer){


    }
    var number1 = a
    var number2 = b
    var number3 = c

    number1 = number1 * number1
    number2 = number2 * number2
    number3 = number3 * number3
    if (number1 + number2 == number3) {
        return true
    } else {
        return false
    }

}