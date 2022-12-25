package Test

fun main() {
    fun sum(a:Int,b:Int) = a+b
    sum(2,3)

    fun noReturn() = println("안녕")
    noReturn()

    fun max(a:Int,b:Int): Int{
        return if (a >b) a else b
    }

    fun varara(vararg a: Int){
        for(i in a){
            println(i)
        }
    }
    varara(3,2,1,2)

    fun varara2(a: Array<Int>){
        for(i in a){
            println(i)
        }
    }
    var ab = arrayOf<Int>(10,20)
    varara2(ab)

    //변수명   //선언 자료형           //람다 매개 변수 //처리내용
    var multi: (Int,Int) -> Int = {a,b -> a+b}
    var multi2= {a:Int, b:Int -> a+b} //선언 자료형 생략

    val nestedLambda = {{ println("중첩 람다") }}
    nestedLambda()()

    fun callByValue(b: Boolean): Boolean {
        println("callByValue function")
        return b
    }

    var lambda = {
        println("lambda function")
        true
    }

    val result = callByValue(lambda())
    println(result)

    fun funcParam(a:Int, b:Int, c:(Int, Int) -> Int={x,y -> x+y}): Int{
        return c(a,b)
    }
    println(funcParam(3,2))

    fun funcParam2(a:Int, b:Int, c:(Int, Int) -> Int): Int{ //이 람다 조건을 어떻게 처리해야할 지 정해져 있지 않은 상태
        return c(a,b)
    }
    println(funcParam2(3,2, ::sum)) //1. 그래서 함수를 참조하거나,

    fun moreParam(out: (String, String) -> String) { //이 람다 조건을 어떻게 처리해야할 지 정해져 있지 않은 상태
        println(out("OneParam", "TwoParam"))
    }
    moreParam{a,b -> "안녕 $a $b"} //2. 사용할때 함수 사용식을 만들어서 사용

    fun withArgs(a: String, b: String, out: (String, String) -> String){
        println(out(a, b))
    }

    withArgs("1","2", {a,b -> "$a $b"})
    withArgs("1","2"){a,b -> "$a $b"}
}