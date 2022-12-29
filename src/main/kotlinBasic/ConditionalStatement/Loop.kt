package ConditionalStatement

import java.awt.ScrollPane

fun main() {
    var sum = 0
    for (x in 1..10) sum += x
    println("sum: $sum")

    for (i in 5 downTo 1 ) print("i $i")

    for(i in 1..5 step 2) print("i $i")

    for (i in 5 downTo 1 step 2 ) print("i $i")

    //while문
    var i = 1
    while (i <= 5){
        print("$i")
        i++
    }

    val n = readLine()!!.toInt()
    for(i in 1 .. n){
        for(space in 1..(n-i)){
            print(" ")
        }
        for(star in 1 until 2*i){
            print("*")
        }
        println()
    }

}