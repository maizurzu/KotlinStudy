package Test

fun main() {
    //일반적일때는
    fun sum(a:Int, b:Int): Int{
        return a +b
    }

    //간략화
    fun sum2(a:Int, b:Int): Int = a+ b  //return을 생략 JS의 화살표 함수와 비슷

    //리턴 타입도 생략 가능
    fun sum3(a:Int, b:Int) = a+b
    var sum3:Int = sum3(3,2)

    //리턴값 없는 함수
    fun noReturn(name:String): Unit{
        println("$name")
        // return Unit //이게 생략되어있다고 생각
    }

    //고차 함수
        //잊지말자 람다식은 인자로 넘기거나 결과값으로 반환이 가능하다.
    fun highFunc(sum:(Int,Int) ->Int, a:Int, b:Int): Int{
        return sum(a,b)
    }
    //sum이라는 이름의 람다식은 (int,int)를 받아서 Int를 return한다.
    println(highFunc({x,y->x+y},10,20))
    //highFunc을 호출할때 -> highFunc({람다 매개인수 어케 사용할래?},a인자,b인자)

    fun highFunc(a:Int, b:Int,sum:(Int,Int) ->Int): Int{
        return sum(a,b)
    }

    println(highFunc(10,20){x,y -> x+y})
    //람다식을 마지막 매개변수로 사용하면 가독성 있게 ( ) 밖으로 빼낼수 있다.

    //변수명: 자료형(라다식) = {매개변수 -> 처리 내용}
    val test: (a:Int,b:Int) -> Int = {a,b -> a+b}

    //자료형 생략 가능
    val test2 = {x:Int, b:Int -> x+b}

    //함수 참조
    fun testSum(x:Int, y:Int) = x+y

    fun funcParam(a:Int, b:Int, c:(Int,Int) -> Int): Int{
        return c(a,b)
    }

    println(funcParam(3,2){x,y -> x+y})
    //이전의 배운 내용에 따르면 위와 같이 람다 매개변수를 사용하는 방법을 제시하지만, 이미 만들어둔 함수가 있다면,
    println(funcParam(3,2,::sum))
    //위와 같은 방법으로 ::함수명 으로 해당 함수를 참조하여 처리도 가능하다.

        //변수명: 타입(람다식) = 익명함수(fun(x,y) = x+y)
    val add: (Int,Int) -> Int = fun(x,y) = x+y

    //add2변수 = 익명함수 근데, 이럴거면 그냥 일반 함수를 만들듯?
    val add2 = fun(x:Int, y:Int):Int = x+y
}