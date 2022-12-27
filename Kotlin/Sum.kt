fun main() {
    var sum = 0
//  for문
    for (x in 1..10)
    {
        sum += x
    }

    println("sum: $sum")

//  while문
    sum = 0
    var x = 0

    while (x <= 10)
    {
        sum += x
        x++
    }

    println("sum: $sum")

    sum = 0
    x = 0

    do {
        sum += x
        x++
    } while (x <= 10)

    println("sum: $sum")

    var one: IntArray = intArrayOf(10, 20, 30)

    for (i in one.indices) {
        println(one[i])
    }

    for (value in one)
    {
        println(value)
    }

    var two : Array<String> = arrayOf("하나", "둘", "셋")
    for (i in 0..2 step 1)
    {
        println(two[i])
    }

    var k : Int = 0
    while (k < two.size)
    {
        println(two[k])
        k++
    }
}