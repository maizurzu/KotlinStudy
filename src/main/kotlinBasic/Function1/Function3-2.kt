package Function1

fun highFunc(a:Int, b:Int, sum:(Int, Int) -> Int): Int{
    return sum(a,b)
}

fun main(args: Array<String>) {
    //기본 람다식
    var test = {a: Int,b: Int -> a+b}
    println(test(10,20))

    //응용된 함수 사용
    val result = highFunc(10,20){x,y -> x+y}
    println(result)


}