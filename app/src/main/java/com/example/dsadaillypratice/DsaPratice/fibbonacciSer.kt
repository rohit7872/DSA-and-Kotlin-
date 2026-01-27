fun main() {
    fibbonacci(10)
}


fun fibbonacci(num:Int){

    var firstnum = 0
    var secondNum = 1
    var intList :MutableList<Int> = mutableListOf()
    for(i in 1..num){
        var result = firstnum + secondNum
        intList.add(firstnum)
        firstnum= secondNum

        secondNum = result


    }

    print(intList)
}