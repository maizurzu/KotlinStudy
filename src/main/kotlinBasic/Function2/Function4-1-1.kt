package Function2
fun main() {
    //일반 변수에 람다식 할당
    // val multi = {a: Int, b:Int -> a*b}
    val multi: (a:Int, b:Int) -> Int = {a,b -> a*b}

    val result = multi(3,5)
    println(result)

    val multi2: (Int,Int) -> Int = { x: Int, y: Int ->
        println("x+y: ${x+y}")
        x* y
        //표현식이 2줄 이상일때는 마지막 표현식이 반환됨
    }
    println(multi2(4,3))

    //val multi: (Int, Int) -> Int = { x: Int, y: Int -> x * y }
    val multi3 = { x: Int, y: Int -> x * y } // 선언 자료형 생략
    val multi4: (Int, Int) -> Int = { x, y -> x * y } // 람다식 매개변수 자료형 생략
//   val multi5 = { x, y -> x * y } // error

    //리턴값이 없거나 매개변수가 하나일 때
    val greet: () -> Unit ={ println("Hello World") }
    val square: (Int)-> Int ={x -> x*x}
    println(greet())
    println(square(5))
    val greet1= { println("Hello World") }
    val square1 = {x:Int -> x*x}
    println(greet1())
    println(square1(5))

    //고차함수의 형태
    fun sum(a:Int, b:Int) = a+b

    fun mul(a:Int, b:Int):Int{
        return  a+b
    }

    fun funcFunc(a:Int, b:Int) = sum(a,b) //리턴값으로 함수 사용

    val funcTest = sum(10,10)
    val funcTest2 = mul(sum(10,20),30)
    val funcTest3 = funcFunc(2,3)

    println("funcTest: $funcTest funcTest2: $funcTest2, funcTest3: $funcTest3")

    //앞의 고차함수가 이제 이해가 됨
    fun highFunc(sum:(Int,Int) -> Int, a:Int, b:Int): Int{
        return sum(a,b)
    }
    //sum이라는 변수에 람다 함수를 만들고, 그 함수를 return한거임

    //--값에의한 호출--
    val callValue = calByValue(lambda())
    println(callValue)

    //이름에 의한 호출
    val callName = callByName(otherLambda)
    println(callName)
}

//값에 의한 호출
fun calByValue(b:Boolean):Boolean{
    println("call by value")
    return b
}

val lambda: ()->Boolean = {
    println("lamda function")
    true
}

//이름에 의한 호출
fun callByName(b: () -> Boolean):Boolean{
    println("call by Name function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("OtherLambda function")
    true
}