fun main() {
//    홀수 누적
    var sum = 0
    var i = 0

    while (i <= 100) {
        if (i % 2 == 1)
            sum += i
        i++
    }

    println("sum(while) = $sum")

    sum = 0
    i = 0

//    2씩 건너뛰면서 더함
    for(i in 1..100 step 2)
    {
        sum += i
    }

    println("sum(for) = $sum")
}