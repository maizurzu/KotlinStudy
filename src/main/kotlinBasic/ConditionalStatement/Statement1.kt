package ConditionalStatement


fun main() {
    val a = 12
    val b = 7

    //기본
    var max:Int
    if(a >b) max = a
    else max = b
    //간략화
    val max2 = if(a>b) a else b

    //블록을 사용하는 경우
    val max3 = if(a>b){
        println("a선택")
        a
    }else{
        println("b선택")
        b
    }
    println(max3)

    //else if문으로 조건문 중첩
    val num = 0
    val result = if(num > 0) "양수값"
                else if (num < 0) "음수값"
                else "0"

    //비교 연산자와 논리곱 연산자 사용
    print("Enter the score: ") //println()과 개행의 차이뿐
    val score = readLine()!!.toDouble()
    var grade = 'F'

    if(score >= 90.0){
        grade = 'A'
    }else if (score >= 80 && score <= 89.9){
        grade ='B'
    }else if(score >= 80 && score <= 79.9){
        grade = 'C'
    }
    println("score: $score, grade:$grade")

    //범위(range) 연산자 사용
    if(score >= 90.0){
        grade = 'A'
    }else if (score in 80.0 .. 89.9){
        grade ='B'
    }else if(score in 80.0 .. 79.9){
        grade = 'C'
    }
    println("score: $score, grade:$grade")

    //switch-case문을 대체하는 when문
//    var x = 1
//    when(x){
//        1 -> print("x == 1")
//        2 -> print("x == 2")
//        else -> {
//            println("x는 1,2가 아니다.")
//        }
//    }

    // -----------
        //예시 1
    print("Enter an Integer: ")
    var x = readLine()!!.toInt()
    when(x){
        0,1 -> print("x == 0 or x == 1") //여러 조건과 비교
        else -> print("other")
    }

    //예시2
    val s = "555"
    print("Enter an integer: ")
    val x2 = readLine()!!.toInt()

    when(x2){
        s.toInt() -> print("equals") // 함수의 반환값과 x를 비교
        else -> print("other")
    }

    //예시3 - in 연산자 사용
    print("Enter an integer: ")
    when(readLine()!!.toInt()){
        in 1.. 10 -> print("x는 1이상 10 이하")
        !in 10..20 -> print("x는 10이상 20이하가 아님")
        else -> print("other")
    }

    //예시4
    val str = "안녕하세요"
    val result2 = when(str){
        is String -> "문자열"
        else -> false
    }

    //예시5
    print("Enter an score: ")
    val score2 = readLine()!!.toDouble()
    val grade2 = when(score2){
        in 90.0..100.0 -> 'A'
        in 80.0..89.9 -> 'B'
        in 70.0..79.9 -> 'C'
        else -> 'F'
    }
    println("score: $score, grade: $grade")

    //인자가 없는 when문
    print("Enter the score: ")
    val score3 = readLine()!!.toDouble()
    var grade3: Char = 'F'

    when {
        score >= 90.0 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }
    println("score: $score, grade: $grade")
}