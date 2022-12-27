fun main() {
    var two = Array<IntArray>(3, { IntArray(3) })
    var value : Int = 100

    for (i in 0..2 step 1)
    {
        for (j in 0..2 step 1)
        {
            two[i][j] = value
            value += 10
            println("two[$i][$j] = ${two[i][j]}")
        }
    }
}