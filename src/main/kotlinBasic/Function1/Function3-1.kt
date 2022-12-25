package Function1
//fun Function3.sum(a:Int, b:Int):Int{
//    return a+b
//}

//fun Function3.sum(a:Int, b:Int):Int = a+b

//Unit 반환 : Void라고 생각하면 됨
fun sum(a:Int, b:Int) = a+b

fun max(a:Int, b:Int): Int{
    return if(a>b) a else b
}

//리턴값이 없는 경우
fun outFunc(name:String):Unit{
    println("name: $name")
}

//리턴 타입 생략
fun sum3(a:Int, b:Int) = a+ b
fun max2(a:Int, b:Int) = if(a >b) a else b
fun outFunc2(name:String) = println("name : $name")

//가변 인자
fun normalVarargs(vararg a: Int){
    for (num in a){
        println("가변인자: $num")
    }
}

//함수 구현 예제
fun Test(initial: Float = 0f, vararg numbers: Float): Double{
    var total = 0f
    for (num in numbers){
        total += num
    }

    val avg = if(initial != 0f){
        (initial+total) / (numbers.size +1)
    }else{
        total/(numbers.size +1)
    }

    return avg.toDouble()
}

//매개변수에 디폴트 값 지정하기
fun defaultParam(a: Int = 2, b: Int = 5) = "a+b : ${a + b}"

fun main(args: Array<String>) {

    println(sum(1,2))

//    println(sum2(3,4)) //지역함수가 선언되기 이전에 호출하는 것은 불가능하다.

    fun sum2(a:Int, b:Int) = a+b

    println(sum2(3,4))

    //max함수
    println(max(3,4))

    outFunc("Hello")

    println(defaultParam())
    println(defaultParam(10,20))

    normalVarargs(1,2,3,4,5)

    //예제 테스트
    println(Test())
    println(Test(initial = 5f))
    println(Test(5f,10f,20f))
    println(Test(numbers = *floatArrayOf(5f,10f)))
    //floatArrayOf: Returns an array containing the specified Float numbers.
}