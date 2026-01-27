fun main() {
    println(digitFrequency(12345, 1))
}

fun digitFrequency(num: Int, T: Int): Int {
    var result = 0
    var number = num
    var input = T

    while (number>0){

        var dig = number%10
        println(dig)
        number= number/10
        if (dig==input){
            result++
        }
    }
    return result

//    for (i in num.toString()) {
//        if (i.toString().toInt() == T) {
//            result++
//        }
//    }

    return result
}