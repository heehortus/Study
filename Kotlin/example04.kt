//전역변수
var myVar: Int = 100

fun main() {
//  지역변수
    var myVar : Int = 0 //변수 값 수정 불가
//  main의 myVar은 지역변수 값인 myvar = 0 값
    println ("main()'s myVar: $myVar")

    var sum : Int = addFunction(10, 20)
    println(sum)
}

fun addFunction(num1: Int, num2: Int) : Int {
    var hap : Int
    println("addFunction()'s myVar : $myVar")
//  전역변수인 myVar의 100값이 더해진다.
    hap = num1 + num2 + myVar
    return hap
}