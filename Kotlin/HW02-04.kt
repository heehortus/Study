fun main() {
//    5단에서 8단까지 출력
    for (i in 5..8) {
        for (j in 1..9) {
            println("$i X $j = ${i * j}")
        }
    }

//    print("\n")

// 단 사이에 줄 넣은 결과
    for (i in 5..8) {
        for (j in 1..9) {
            println("$i X $j = ${i * j}")
        }
        println("**************")
    }
}