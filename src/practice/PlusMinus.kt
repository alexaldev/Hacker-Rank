package practice

import java.util.*

fun plusMinus(arr: Array<Int>) {

    val size = arr.size.toFloat()
    var positives = 0f
    var zeros = 0f
    var negatives = 0f

    arr.forEach {
        when {
            it > 0 -> positives += 1
            it == 0 -> zeros += 1
            else -> negatives += 1
        }
    }

    print("%.5f \n%.5f \n%.5f".format(positives / size, negatives / size, zeros / size))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
