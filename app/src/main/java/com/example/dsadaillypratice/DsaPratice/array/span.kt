

fun main() {
    var Array = intArrayOf(12, 34, 23)

    println(span(Array))
}

// span means max or min number
fun span(Array: IntArray):Int {
  var max = Array[0]
    var min = Array[0]
for (i in 1 until Array.size)    {

    if (Array[i]>max){
        max= Array[i]

    }else if (Array[i]<min){
        min=Array[i]

    }

}

   return max - min
}


/*
1) Initialize varible max and give it first element of array
2) Iterate array from second elemeent
3) Compare each element with max -
-- If the current element is greater than max, update max with this value.
4) After the loop ends, max will hold the maximum value in the array.
 */