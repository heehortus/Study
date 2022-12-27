open class Car {
//    초기화
    var color : String = ""
    var speed : Int = 0

    companion object {
        var carCount: Int = 0
        const val MAXSPEED : Int = 200
        const val MINSPEED : Int = 0

        fun currentCarCount() : Int {
            return carCount
        }
    }
//    생성자 함수
    constructor(color: String, speed: Int) {
        this.color = color
        this.speed = speed
        carCount++
    }

    constructor(speed: Int)
    {
        this.speed = speed
    }

    constructor() {
    }

    open fun upSpeed (value: Int) {
        if (speed + value >= 200)
            speed = 200
        else
            speed = speed + value
    }

    fun downSpeed(value: Int) {
        if (speed - value <= 0)
            speed = 0
        else
            speed = speed - value
    }
}

// 부모 클래스(슈퍼 클래스) Car을 상속 받은 자식(서브) 클래스
class Automobile: Car {
    
    var seatNum : Int = 5

    constructor(){
    }

    
    fun countSeatNUm(): Int {
        return seatNum
    }

    //메소드 오버라이딩
    override fun upSpeed(value: Int) {
        if (speed + value >= 300)
            speed = 300
        else
            speed = speed + value
    }
}

fun main() {
    var auto : Automobile = Automobile()
    auto.upSpeed(250)
    println("승용차의 좌석은 " + auto.seatNum + "개이며, 속도는 " + auto.speed + "km입니다.")
}