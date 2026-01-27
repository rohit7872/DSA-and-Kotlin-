fun main() {
    var Array = intArrayOf(3 ,1,0, 7,5)
    printBar(Array)
}

fun printBar(Array:IntArray){
    var max = Array[0]
    for (i in 1 until Array.size){
        if (Array[i]>max){
            max= Array[i]
        }
    }

   for (floor in max downTo 1){

       for (i in 0 until  Array.size){
           if (Array[i]>=floor){

               print("*")
           }
           else{
               print(" ")
           }
       }
       println()
   }

}