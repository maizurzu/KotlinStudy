package DataTypeAndOperator

fun main(args: Array<String>) {
    val x = 4   // 0100(2) 4(10)
    val y = 0b0000_1010 //10(10)
    val z = 0x0f    //0b0000_1111(2) 15(10)

    println("x shl 2 -> ${x.shl(2)}")
    println("x inv -> ${x.inv()}")
}

