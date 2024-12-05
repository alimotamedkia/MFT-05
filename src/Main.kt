fun main() {
//    findMax()
//    check()
//    lambda1()
//    lambda2()
    checkString()
}

fun findMax(): Int? {

    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val list = mutableListOf<Int>()
    list.add(a)
    list.add(b)
    list.add(c)

    if (list.isEmpty()) {
        println("هیچ مقداری وجود ندارد")
        return null
    } else {
        println("بالاترین مقدار ${list.max()} است")
        return list.max()
    }


}

fun check() {
    val a = "ali.motamedkia@gmail.com"
    println(a.endsWith("@gmail.com"))
}

fun lambda1() {
    val lambda = { a: Int, b: Int -> println(a * b) }
    lambda(4, 3)
}

fun lambda2() {
    val lambda = { a: Int -> println(a % 2 == 0) }
    lambda(4)
    //OR
    val lambda2: (Int) -> Unit = { println(it % 2 == 0) }
    lambda2(4)
}

fun checkString() {
    val check: (String) -> Unit ={ input->println(input==input.reversed())}
    check(readln())
}
