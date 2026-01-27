import android.os.Build

// test
fun main() {
    SecondlargEle()
}

  fun SecondlargEle() {
    var mainArry = intArrayOf(1, 1, 10, 12, 34, 35)
    var max = mainArry[0]
    var sortedArray = mutableListOf<Int>()
    for (i in 0..mainArry.size - 1) {
        if (max < mainArry[i]) {
            sortedArray.add(mainArry[i])

        } else {
            sortedArray.add(mainArry[i])
        }


    }



    println(sortedArray[sortedArray.size - 2])


}
