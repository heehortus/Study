fun main() {
    var count : Int = 55

    if (count >= 90)
    {
        println("if문 학점: A")
    }
    else if (count >= 80)
    {
        println("if문 학점: B")
    }

    else if (count >= 70)
    {
        println("if문 학점: C")
    }

    else if (count >= 60)
    {
        println("if문 학점: D")
    }

    else if (count >= 50)
    {
        println("if문 학점: E")
    }

    else
    {
        println("if문 학점: F")
    }

    var jumsu : Int = (count/10) * 10

    when (jumsu)
    {
        in 90 .. 100 -> println("when문: A")
        in 80 ..89 -> println("when문: B")
        in 70 .. 79 -> println("when문: C")
        in 60 .. 69 -> println("when문: D")
        in 50 .. 59 -> println("when문: E")
        else -> println("when문: F")
    }
}