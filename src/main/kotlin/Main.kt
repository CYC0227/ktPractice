
fun main(){
//    print("hello world")

    val num: Int
    num = 10

    println("number is ${num + 1}")

    val readOnlyList = listOf("ab", "bc", "cd")
    val mutableList = mutableListOf("ab", "bc", "cd")

    println(readOnlyList.first())

    println(readOnlyList.last())
    println(readOnlyList.count())
    println(readOnlyList.indexOf("bc"))
    println(readOnlyList.size)
    println("bc" in readOnlyList)

}
