package DataTypeAndOperator

fun main(args: Array<String>) {
    //null 사용법
//    var str1:String?
//    str1 = null
//    println(str1)

//    println("str1: ${str1}, length: ${str1.length}")

    // safe call
//    var str1:String?
//    str1 = "Hello"
//
//    println("str1: $str1, length: ${str1?.length}")

    //Non-null !!

//    var str1:String?
//    str1 = "Hello"
//
//    println("str1: $str1, length: ${str1!!.length}")

    //Elvis 연산자 (?:)
//    var str1: String?
//    str1 = null
//    val len = str1?.length ?: -1
//    println("str1: $str1, length: $len")

    //safe call, elvis 표현식

//    var str1: String?
//    str1 = null
//    println("str1: $str1, length: ${str1?.length ?: -1}")

    //-----등호확인-----

//    val a:Int = 128
//    val b = a

//    println( a == b)
//    println( a === b)

//    val c:Int? = a
//    val d:Int? = a
//
//    println( c == d)
//    println( c === b)

//    val a:Int = 5
//    val b = a
//    val c:Int? = a
//    val d:Int? = a
//    println(c == d)
//    println(c === d)

    //스마트 형변환
    var test: Number = 12.2
    println("$test")

    test = 12   //Int형으로 스마트 캐스팅
    println("$test")

    test = 120L   //Long형으로 스마트 캐스팅
    println("$test")

    test = 12.0F   //Float형으로 스마트 캐스팅
    println("$test")

    //자료형 검사
    val num = 256
    if(num is Int){
        print("num: $num")
    }else if(num !is Int){
        println("Not a Int")
    }

    //Any형 변수의 변환
    var a: Any = 1
    a = 20L
    println("a: $a, type: ${a.javaClass}")  //a의 자바 기본형을 출력하면 Long형


    checkArg("Hello")
    checkArg(5)
}

fun checkArg(x: Any){
    if(x is String){
        println("s is String: $x")
    }

    if(x is Int){
        println("x is Int: $x")
    }
}