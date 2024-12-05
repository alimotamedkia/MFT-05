fun main() {
//    findMax()
check()
}

fun findMax (): Int?{

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
    }
    else {
        println("بالاترین مقدار ${list.max()} است")
        return list.max()
    }


}

fun check(){
    val a = "ali.motamedkia@gmail.com"
    println(a.endsWith("@gmail.com"))
}