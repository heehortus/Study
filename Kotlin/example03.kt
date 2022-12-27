fun main() {
    var array1= Array<Int>(4, {0})
    array1[0] = 10

    val numbers = arrayOf(4, 5, 7, 3)
    val animals = arrayOf("Cat", "Dog", "Lion")

    val nulls = arrayOfNulls<Int>(4)

    var two = Array<IntArray>(3, { IntArray(4) })
    two[0][0] = 100
    two[2][3] = 200

    val array2 = arrayOf(1, 2, 3)
    val array3 = arrayOf(4, 5, 6)
    val array4 = arrayOf(7, 8, 9)

    val arr2d = arrayOf(array2, array3, array4)

    val three : IntArray = intArrayOf(1, 2, 3, 4)
    for (i in three.indices) {
        println(three[i])
    }

    for (i in three)
    {
        println(three[i-1])
    }

    var one = ArrayList<Int>(4)
    one.add(10)
    one.add(20)
    var hap = one.get(0) + one.get(1)



}