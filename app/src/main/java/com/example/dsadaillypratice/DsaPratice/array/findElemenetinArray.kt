
fun main() {
    var Array = intArrayOf(12, 34, 23,23,2,34)
    println( findelemenetinarray(Array,34 ))
}

fun findelemenetinarray(Array:IntArray ,num:Int): Int? {
   var result = -1
    for (i in 0 until Array.size){
        if (num==Array[i]){
            result = i
            break
        }
    }
   return result
}