package DataTypeAndOperator

fun main(args: Array<String>) {
//    var num:Double = 0.1
//
//    for(x in 0..999){
//        num += 0.1
//    }
//    println(num)

    val str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 == str2 ${str1 == str2}")
    println("str1 === str2 ${str1 === str2}")

    println("str1 == str3 ${str1 == str3}")
    println("str1 === str3 ${str1 === str3}")

    str2 = str1
    println("str1 == str2 ${str1 == str2}")
    println("str1 === str2 ${str1 === str2}")

    val a =1
    val str4 = "a = $a"
    val str5 = "a = ${a + 2}" //문자열에 표현식 사용

    println("str1: \"$str4\", str2: \"$str5\" ")
}