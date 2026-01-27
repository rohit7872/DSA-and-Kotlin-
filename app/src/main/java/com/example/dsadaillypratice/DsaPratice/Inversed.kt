fun main() {
    println(findGCD(28, 4))
}

fun findGCD(number1:Int , number2 :Int):Int{
    var result = 0
    for (i in 1 ..100)
    {
        if (number1 %i == 0 && number2 %i ==0){
            result= i

        }

    }
    return result
    }

