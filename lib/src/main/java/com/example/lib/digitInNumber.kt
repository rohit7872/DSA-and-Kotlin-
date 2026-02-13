fun main(){
    var desireNumber = 11
//
//    println(desireNumber.toString().length)

    var dig = 0
    while (desireNumber >0){
        desireNumber = desireNumber/ 10
        dig++

    }

    println(dig)

}