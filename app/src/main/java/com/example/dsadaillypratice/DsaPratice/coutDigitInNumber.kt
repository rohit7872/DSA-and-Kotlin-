fun main() {
    println( countDigit(34))
}


//fun countDigit(num:Int):Int{
//    return if (num==0) 1 else num.toString().length
//}

fun countDigit(num:Int):Int{
    var result = 0
    var num= num
while (num!=0){
    num = num/10
    result++
}
    return result
}