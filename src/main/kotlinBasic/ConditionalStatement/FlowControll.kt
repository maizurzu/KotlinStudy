package ConditionalStatement

fun main() {
    fun add(a:Int, b:Int): Int{
        return a +b
        println("이 코드는 실행되지 않습니다.") //여기에 도달x
    }

    //람다식에서 return 사용
    retFunc(3,3)
}
inline fun inlineLambda(a:Int, b:Int, out:(Int,Int)-> Unit){
    out(a,b)
}

fun retFunc(a:Int, b:Int){
    println("start of retFunc")
    inlineLambda(a,b){a,b ->
        val result = a +b
        if(result >10 ) return //10보다 크면 이 함수를 빠져나감
        println("result: $result") //10보다 크면 이 문장에 도달X
    }
    println("end of retFunc")
}