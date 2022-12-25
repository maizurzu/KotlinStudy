fun main(args: Array<String>) {
    val x = 10  // 0000_1010(2)
    println("x shl 2 -> ${x.shl(2)}")
    println("x shr 2 -> ${x.shr(2)}")
    println("x ushr 2 -> ${x.ushr(2)}")

    val y = 5 //0000_0101(2)

    //0101 && 0111 -> 0101 -> 5
    println("y and 2 -> ${y.and(7)}")

    //0101 || 0111 -> 0111 -> 7
    println("y and 2 -> ${y.or(7)}")

    //0101 xor 0111 -> 0010 -> 2
    println("y and 2 -> ${y.xor(7)}")

    //0101 -> 5
    //1010 -> -6
    //0110 (-6의 절대값)
    //1001 (1의 보수)
    //1010 (2의 보수) -> 이게 바로 십진수로 -6
    println("y inv -> ${y.inv()}")
}

